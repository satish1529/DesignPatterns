package com.test.FlyWeight;

public enum CardSuit {
   CLUB_ONE(CardRank.ONE,CardShape.CLUB,CardColor.BLACK),
   CLUB_TWO(CardRank.TWO,CardShape.CLUB,CardColor.BLACK),
   CLUB_THREE(CardRank.THREE,CardShape.CLUB,CardColor.BLACK),
   CLUB_FOUR(CardRank.FOUR,CardShape.CLUB,CardColor.BLACK),
   CLUB_FIVE(CardRank.FIVE,CardShape.CLUB,CardColor.BLACK),
   CLUB_SIX(CardRank.SIX,CardShape.CLUB,CardColor.BLACK),
   CLUB_SEVEN(CardRank.SEVEN,CardShape.CLUB,CardColor.BLACK),
   CLUB_EIGHT(CardRank.EIGHT,CardShape.CLUB,CardColor.BLACK),
   CLUB_NINE(CardRank.NINE,CardShape.CLUB,CardColor.BLACK),
   CLUB_TEN(CardRank.TEN,CardShape.CLUB,CardColor.BLACK),
   CLUB_JACK(CardRank.JACK,CardShape.CLUB,CardColor.BLACK),
   CLUB_QUEEN(CardRank.QUEEN,CardShape.CLUB,CardColor.BLACK),
   CLUB_KING(CardRank.KING,CardShape.CLUB,CardColor.BLACK),
   
   SPADE_ONE(CardRank.ONE,CardShape.SPADE,CardColor.BLACK),
   SPADE_TWO(CardRank.TWO,CardShape.SPADE,CardColor.BLACK),
   SPADE_THREE(CardRank.THREE,CardShape.SPADE,CardColor.BLACK),
   SPADE_FOUR(CardRank.FOUR,CardShape.SPADE,CardColor.BLACK),
   SPADE_FIVE(CardRank.FIVE,CardShape.SPADE,CardColor.BLACK),
   SPADE_SIX(CardRank.SIX,CardShape.SPADE,CardColor.BLACK),
   SPADE_SEVEN(CardRank.SEVEN,CardShape.SPADE,CardColor.BLACK),
   SPADE_EIGHT(CardRank.EIGHT,CardShape.SPADE,CardColor.BLACK),
   SPADE_NINE(CardRank.NINE,CardShape.SPADE,CardColor.BLACK),
   SPADE_TEN(CardRank.TEN,CardShape.SPADE,CardColor.BLACK),
   SPADE_JACK(CardRank.JACK,CardShape.SPADE,CardColor.BLACK),
   SPADE_QUEEN(CardRank.QUEEN,CardShape.SPADE,CardColor.BLACK),
   SPADE_KING(CardRank.KING,CardShape.SPADE,CardColor.BLACK),
   
   DIAMOND_ONE(CardRank.ONE,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_TWO(CardRank.TWO,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_THREE(CardRank.THREE,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_FOUR(CardRank.FOUR,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_FIVE(CardRank.FIVE,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_SIX(CardRank.SIX,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_SEVEN(CardRank.SEVEN,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_EIGHT(CardRank.EIGHT,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_NINE(CardRank.NINE,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_TEN(CardRank.TEN,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_JACK(CardRank.JACK,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_QUEEN(CardRank.QUEEN,CardShape.DIAMOND,CardColor.RED),
   DIAMOND_KING(CardRank.KING,CardShape.DIAMOND,CardColor.RED),
   
   HEART_ONE(CardRank.ONE,CardShape.HEART,CardColor.RED),
   HEART_TWO(CardRank.TWO,CardShape.HEART,CardColor.RED),
   HEART_THREE(CardRank.THREE,CardShape.HEART,CardColor.RED),
   HEART_FOUR(CardRank.FOUR,CardShape.HEART,CardColor.RED),
   HEART_FIVE(CardRank.FIVE,CardShape.HEART,CardColor.RED),
   HEART_SIX(CardRank.SIX,CardShape.HEART,CardColor.RED),
   HEART_SEVEN(CardRank.SEVEN,CardShape.HEART,CardColor.RED),
   HEART_EIGHT(CardRank.EIGHT,CardShape.HEART,CardColor.RED),
   HEART_NINE(CardRank.NINE,CardShape.HEART,CardColor.RED),
   HEART_TEN(CardRank.TEN,CardShape.HEART,CardColor.RED),
   HEART_JACK(CardRank.JACK,CardShape.HEART,CardColor.RED),
   HEART_QUEEN(CardRank.QUEEN,CardShape.HEART,CardColor.RED),
   HEART_KING(CardRank.KING,CardShape.HEART,CardColor.RED);
   
   CardColor color ;
   
   CardRank rank;
   
   CardShape shape;
   
   CardSuit(CardRank rank,CardShape shape,CardColor color)
   {
	   this.color = color;
	   this.rank = rank;
	   this.shape = shape;
   }
   
   public CardColor getColor()
   {
	   return this.color;
   }
   
   public CardRank getRank()
   {
	   return this.rank;
   }
   
   public CardShape getShape()
   {
	   return this.shape;
   }
   
   public static void main(String[] args) {
	CardSuit cs = CardSuit.DIAMOND_EIGHT;
	if(cs.getShape()==CardShape.DIAMOND)
		System.out.println("matched");
}
}
