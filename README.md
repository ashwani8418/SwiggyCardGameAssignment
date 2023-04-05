# SwiggyCardGameAssignment
To run this Game, Go to the Main class and run the main class to start the game.
The line MultiPlayerGame game = new MultiPlayerGame(player) in the Main class is creating a new instance of the MultiPlayerGame class and assigning it to the 
variable game. The constructor of the MultiPlayerGame class takes a Player object as a parameter.

Once the game object has been created, it can be used to start the game by calling a method on it.
For example, if the MultiPlayerGame class has a method called startGame(), you could call it like this: game.playGame();

******************MultiPlayerGame Class 
The dealCard() method returns the top card from the deck, and increments the top index to keep track of which card was dealt last. 

*********************In Deck Class

The Deck class represents a deck of playing cards. It contains an array of Card objects representing each card in the deck, and methods for shuffling the deck and 
drawing cards from the deck.

The constructor of the Deck class initializes the deck by creating a new array of Card objects with a size of 52, and then populating it with cards of each suit and
rank.

The shuffleCard method shuffles the cards in the deck using a random number generator to swap pairs of cards at random positions in the deck. After shuffling, the 
topIndex variable is reset to 0 to indicate that the deck is freshly shuffled and ready to deal.

The drawCard method returns the next card in the deck, starting from the top of the deck (i.e., the first card). It does this by returning the card at the current 
topIndex position, and then incrementing topIndex to point to the next card in the deck. If topIndex is equal to or greater than the size of the deck, the method 
returns null, indicating that the deck is empty and no more cards can be drawn.
The drawCardFromDeck() method draw card to the player hand.

The isGameDraw() is boolean type and used to check deck Pile is empty or not. It returns true or False;

******************In Card

This code defines a Card class that represents a playing card with a rank and suit. It uses a Java 16 feature called record, which is a concise way to declare classes 
that are primarily used to hold data.

The Card class has two fields, a Rank and a Suit, which are passed to the constructor when creating a new Card object.

The toString method is overridden to provide a human-readable string representation of the card, which concatenates the name of the rank and suit. 
It returns a string in the format "rank of suit", such as "Ace of Spades".

This Card class can be used as a component of a larger card game project, where it can be utilized by other classes representing the deck of cards, hands of players, 
and so on.



Test Case for 4 Player
To start the game, please choose player between 2 to 4
4
Enter name of 1 player : 
Ashwani
Enter name of 2 player : 
Abhinav
Enter name of 3 player : 
Himanshu
Enter name of 4 player : 
Abhishek
..........Starting Your Game!!!..............
Player Ashwani's turn.
Choose to draw a card to from your hand.
Press 0 : JACK : DIAMONDS
Press 1 : EIGHT : CLUBS
Press 2 : NINE : DIAMONDS
Press 3 : SIX : SPADES
Press 4 : TEN : CLUBS
Top card on discard pile: FIVE of HEARTS
1
EIGHT of CLUBS
Card not matches, Draw a card from Deck pile....
Player Abhinav's turn.
Choose to draw a card to from your hand.
Press 0 : THREE : DIAMONDS
Press 1 : EIGHT : SPADES
Press 2 : SIX : CLUBS
Press 3 : TWO : DIAMONDS
Press 4 : NINE : SPADES
Top card on discard pile: FIVE of HEARTS
4
NINE of SPADES
Card not matches, Draw a card from Deck pile....
Player Himanshu's turn.
Choose to draw a card to from your hand.
Press 0 : SIX : HEARTS
Press 1 : FIVE : CLUBS
Press 2 : KING : SPADES
Press 3 : SIX : DIAMONDS
Press 4 : SEVEN : DIAMONDS
Top card on discard pile: FIVE of HEARTS
0
SIX of HEARTS
Player Abhishek's turn.
Choose to draw a card to from your hand.
Press 0 : NINE : HEARTS
Press 1 : NINE : CLUBS
Press 2 : TEN : HEARTS
Press 3 : ACE : DIAMONDS
Press 4 : JACK : CLUBS
Top card on discard pile: FIVE of HEARTS
2
TEN of HEARTS
Player Ashwani's turn.
Choose to draw a card to from your hand.
Press 0 : JACK : DIAMONDS
Press 1 : NINE : DIAMONDS
Press 2 : SIX : SPADES
Press 3 : TEN : CLUBS
Press 4 : SEVEN : SPADES
Top card on discard pile: FIVE of HEARTS
2
SIX of SPADES
Card not matches, Draw a card from Deck pile....
Player Abhinav's turn.
Choose to draw a card to from your hand.
Press 0 : THREE : DIAMONDS
Press 1 : EIGHT : SPADES
Press 2 : SIX : CLUBS
Press 3 : TWO : DIAMONDS
Press 4 : FIVE : DIAMONDS
Top card on discard pile: FIVE of HEARTS
2
SIX of CLUBS
Card not matches, Draw a card from Deck pile....
Player Himanshu's turn.
Choose to draw a card to from your hand.
Press 0 : FIVE : CLUBS
Press 1 : KING : SPADES
Press 2 : SIX : DIAMONDS
Press 3 : SEVEN : DIAMONDS
Top card on discard pile: FIVE of HEARTS
3
SEVEN of DIAMONDS
Card not matches, Draw a card from Deck pile....
Player Abhishek's turn.
Choose to draw a card to from your hand.
Press 0 : NINE : HEARTS
Press 1 : NINE : CLUBS
Press 2 : ACE : DIAMONDS
Press 3 : JACK : CLUBS
Top card on discard pile: FIVE of HEARTS
0
NINE of HEARTS
Player Ashwani's turn.
Choose to draw a card to from your hand.
Press 0 : JACK : DIAMONDS
Press 1 : NINE : DIAMONDS
Press 2 : TEN : CLUBS
Press 3 : SEVEN : SPADES
Press 4 : TEN : DIAMONDS
Top card on discard pile: FIVE of HEARTS
3
SEVEN of SPADES
Card not matches, Draw a card from Deck pile....
Player Abhinav's turn.
Choose to draw a card to from your hand.
Press 0 : THREE : DIAMONDS
Press 1 : EIGHT : SPADES
Press 2 : TWO : DIAMONDS
Press 3 : FIVE : DIAMONDS
Press 4 : THREE : CLUBS
Top card on discard pile: FIVE of HEARTS
2
TWO of DIAMONDS
Card not matches, Draw a card from Deck pile....
Player Himanshu's turn.
Choose to draw a card to from your hand.
Press 0 : FIVE : CLUBS
Press 1 : KING : SPADES
Press 2 : SIX : DIAMONDS
Press 3 : QUEEN : HEARTS
Top card on discard pile: FIVE of HEARTS
3
QUEEN of HEARTS
Adding 2 to next player's turn.
Player Himanshu's turn.
Choose to draw a card to from your hand.
Press 0 : FIVE : CLUBS
Press 1 : KING : SPADES
Press 2 : SIX : DIAMONDS
Top card on discard pile: FIVE of HEARTS
3
Invalid Choice, Please draw a card from player hand 
2
SIX of DIAMONDS
Card not matches, Draw a card from Deck pile....
Player Abhishek's turn.
Choose to draw a card to from your hand.
Press 0 : NINE : CLUBS
Press 1 : ACE : DIAMONDS
Press 2 : JACK : CLUBS
Top card on discard pile: FIVE of HEARTS
2
JACK of CLUBS
Adding 2 to next player's turn.
Card not matches, Draw a card from Deck pile....
Player Himanshu's turn.
Choose to draw a card to from your hand.
Press 0 : FIVE : CLUBS
Press 1 : KING : SPADES
Press 2 : FIVE : SPADES
Top card on discard pile: FIVE of HEARTS
2
FIVE of SPADES
Player Abhishek's turn.
Choose to draw a card to from your hand.
Press 0 : NINE : CLUBS
Press 1 : ACE : DIAMONDS
Press 2 : EIGHT : DIAMONDS
Top card on discard pile: FIVE of HEARTS
2
EIGHT of DIAMONDS
Card not matches, Draw a card from Deck pile....
Player Ashwani's turn.
Choose to draw a card to from your hand.
Press 0 : JACK : DIAMONDS
Press 1 : NINE : DIAMONDS
Press 2 : TEN : CLUBS
Press 3 : TEN : DIAMONDS
Press 4 : SEVEN : HEARTS
Top card on discard pile: FIVE of HEARTS
4
SEVEN of HEARTS
Player Abhinav's turn.
Choose to draw a card to from your hand.
Press 0 : THREE : DIAMONDS
Press 1 : EIGHT : SPADES
Press 2 : FIVE : DIAMONDS
Press 3 : THREE : CLUBS
Press 4 : QUEEN : DIAMONDS
Top card on discard pile: FIVE of HEARTS
2
FIVE of DIAMONDS
Player Himanshu's turn.
Choose to draw a card to from your hand.
Press 0 : FIVE : CLUBS
Press 1 : KING : SPADES
Top card on discard pile: FIVE of HEARTS
0
FIVE of CLUBS
Player Abhishek's turn.
Choose to draw a card to from your hand.
Press 0 : NINE : CLUBS
Press 1 : ACE : DIAMONDS
Press 2 : QUEEN : SPADES
Top card on discard pile: FIVE of HEARTS
2
QUEEN of SPADES
Adding 2 to next player's turn.
Card not matches, Draw a card from Deck pile....
Player Abhishek's turn.
Choose to draw a card to from your hand.
Press 0 : NINE : CLUBS
Press 1 : ACE : DIAMONDS
Press 2 : TWO : CLUBS
Top card on discard pile: FIVE of HEARTS
2
TWO of CLUBS
Card not matches, Draw a card from Deck pile....
Player Ashwani's turn.
Choose to draw a card to from your hand.
Press 0 : JACK : DIAMONDS
Press 1 : NINE : DIAMONDS
Press 2 : TEN : CLUBS
Press 3 : TEN : DIAMONDS
Top card on discard pile: FIVE of HEARTS
3
TEN of DIAMONDS
Card not matches, Draw a card from Deck pile....
Player Abhinav's turn.
Choose to draw a card to from your hand.
Press 0 : THREE : DIAMONDS
Press 1 : EIGHT : SPADES
Press 2 : THREE : CLUBS
Press 3 : QUEEN : DIAMONDS
Top card on discard pile: FIVE of HEARTS
2
THREE of CLUBS
Card not matches, Draw a card from Deck pile....
Player Himanshu's turn.
Choose to draw a card to from your hand.
Press 0 : KING : SPADES
Top card on discard pile: FIVE of HEARTS
0
KING of SPADES
Reversing the playing turn.....
Card not matches, Draw a card from Deck pile....
Player Abhinav's turn.
Choose to draw a card to from your hand.
Press 0 : THREE : DIAMONDS
Press 1 : EIGHT : SPADES
Press 2 : QUEEN : DIAMONDS
Press 3 : FOUR : CLUBS
Top card on discard pile: FIVE of HEARTS
0
THREE of DIAMONDS
Card not matches, Draw a card from Deck pile....
Player Ashwani's turn.
Choose to draw a card to from your hand.
Press 0 : JACK : DIAMONDS
Press 1 : NINE : DIAMONDS
Press 2 : TEN : CLUBS
Press 3 : THREE : SPADES
Top card on discard pile: FIVE of HEARTS
3
THREE of SPADES
Card not matches, Draw a card from Deck pile....
Player Himanshu's turn.
Choose to draw a card to from your hand.
Press 0 : KING : HEARTS
Top card on discard pile: FIVE of HEARTS
0
KING of HEARTS
Reversing the playing turn.....
Player Abhishek's turn.
Choose to draw a card to from your hand.
Press 0 : NINE : CLUBS
Press 1 : ACE : DIAMONDS
Press 2 : SEVEN : CLUBS
Top card on discard pile: FIVE of HEARTS
2
SEVEN of CLUBS
Card not matches, Draw a card from Deck pile....
Player Ashwani's turn.
Choose to draw a card to from your hand.
Press 0 : JACK : DIAMONDS
Press 1 : NINE : DIAMONDS
Press 2 : TEN : CLUBS
Press 3 : ACE : SPADES
Top card on discard pile: FIVE of HEARTS
3
ACE of SPADES
Skipping the next player in turn
Player Abhinav's turn.
Choose to draw a card to from your hand.
Press 0 : EIGHT : SPADES
Press 1 : QUEEN : DIAMONDS
Press 2 : FOUR : CLUBS
Press 3 : JACK : SPADES
Top card on discard pile: FIVE of HEARTS
3
JACK of SPADES
Adding 2 to next player's turn.
Card not matches, Draw a card from Deck pile....
Player Abhishek's turn.
Choose to draw a card to from your hand.
Press 0 : NINE : CLUBS
Press 1 : ACE : DIAMONDS
Press 2 : ACE : HEARTS
Top card on discard pile: FIVE of HEARTS
0
NINE of CLUBS
Card not matches, Draw a card from Deck pile....
Player Ashwani's turn.
Choose to draw a card to from your hand.
Press 0 : JACK : DIAMONDS
Press 1 : NINE : DIAMONDS
Press 2 : TEN : CLUBS
Top card on discard pile: FIVE of HEARTS
2
TEN of CLUBS
Card not matches, Draw a card from Deck pile....
Player Abhinav's turn.
Choose to draw a card to from your hand.
Press 0 : EIGHT : SPADES
Press 1 : QUEEN : DIAMONDS
Press 2 : FOUR : CLUBS
Press 3 : THREE : HEARTS
Top card on discard pile: FIVE of HEARTS
3
THREE of HEARTS
Congratulation !!!, Himanshu You are Winner of the Game
Thank you for playing, I hope you enjoyed the Game!!!
