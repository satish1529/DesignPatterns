package com.test.VisitorPattern;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class BillingVisitor {
	double totalAmount;
	int totalOrders;
	int totalItems;
	
	public abstract void defaultvisit(Object object);
	
	public abstract void visit(Orders orders);
	
	public abstract void visit(Items items);
	
	public abstract void printBillSummary();
	
	/**
	 * using reflection to identify if visit method is available for the requested visiable object. 
	 */
	public final void visit(Object object){
		if(object!=null){
			try{
				Method method = object.getClass().getMethod("visit", new Class[]{object.getClass()});
				if(method==null) defaultvisit(object);
				else method.invoke(this, new Object[]{object});
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();			 
			}catch (InvocationTargetException e) {
				e.printStackTrace();			}
		}
	}
}
