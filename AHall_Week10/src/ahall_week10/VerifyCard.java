package ahall_week10;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: ahall_week10
 * @Date: Apr 3, 2021
 * @Subclass VerifyCard Description:
 */
//Imports

public class VerifyCard {

    //Declarations
    private String name;
    private String card;
    private String date;
    private int[] cardDate;
    private int fst;
    private int fourth;
    private int fifth;
    private int ninth;
    private int Total;
    private int dateTotal;
    private int lstTwo = 1;
    private int fstFour;
    private int lstFour;
    private int fstTwo;
    private boolean Valid = true;
    private boolean validCard = false;

    VerifyCard(String Name, String cCard, String expDate) {

        name = Name;
        card = cCard;
        date = expDate;

        verifyInfo(name, card, date);
    }

    //Default
    VerifyCard() {
        this("No entry", "No entry", "No entry");
    }

    private void verifyInfo(String name, String cCard, String expDate) {
        
        setName(name);
        setCard(cCard);
        setDate(expDate);
        
        checkCard();
    }
    
    //Set Methods
    private void setName(String Name) {
        name = Name;
    }

    private void setCard(String cCard) {
        card = cCard;
    }

    private void setDate(String exp) {

        exp = exp.replaceAll("/", "");

        int[] expDate = new int[exp.length()];

        for (int i = 0; i < exp.length(); i++) {
            expDate[i] = Integer.parseInt(exp.split("")[i]);
        }
        cardDate = expDate;
        date = exp;
    }

    private void setVerify(boolean validity) {
        validCard = validity;
    }
    
    //Get Methods
    public String getName() {
        return name;
    }


    public String getCard() {
        return card;
    }


    public String getDate() {
        return date;
    }


    public boolean getVerify() {
        return validCard;
    }

    private void checkCard() {
        setArray(this.getCard());
        
    }
    
    private void setArray(String cardNum){
        //set array for card number and set number variables
        int[] cardArray = new int[cardNum.length()];

        for (int i = 0; i < cardNum.length(); i++) {
            cardArray[i] = Integer.parseInt(cardNum.split("")[i]);
        }
        condOne(cardArray);
    }
    /**
     * Method condOne: The first digit must be a 4
     * 
     * @param cardNum 
     */
    private void condOne(int[] cardArray) {

        if (card.matches("^4([0-9]*)")) {
            Valid = true;
            setVerify(Valid);
            condTwo(cardArray);
        } else {
            Valid = false;
            setVerify(Valid);
        }
    }

    /**
     * Method condTwo: The fourth digit must be one greater than the fifth digit
     * @param cardArray 
     */
    private void condTwo(int[] cardArray) {
        Valid = false;
        fourth = cardArray[3]; 
        fifth = cardArray[4];
        if (fourth - fifth == 1) {
            Valid = true;
            setVerify(Valid);
            condThree(cardArray);
        } else {
            Valid = false;
            setVerify(Valid);
        }
    }

    /**
     * Method condThree: The product of the first, fifth, and ninth 
     * digits must be 24
     * @param cardArray 
     */
    private void condThree(int[] cardArray) {
        Valid = false;
        fst = cardArray[0];
        fifth = cardArray[4];
        ninth = cardArray[8];
        if (fst * fifth * ninth == 24) {
            Valid = true;
            setVerify(Valid);
            condFour(cardArray);
        } else {
            Valid = false;
            setVerify(Valid);
        }
    }


    /**
     * Method condFour: The sum of all digits must be evenly divisible by 4
     * @param cardArray 
     */
    private void condFour(int[] cardArray) {
        Valid = false;
        for (int i = 0; i < cardArray.length; i++) {
            Total += cardArray[i];
        }
        
        if ((Total % 4) == 0) {
            Valid = true;
            setVerify(Valid);
            condFive(cardArray, cardDate);
        } else {
            Valid = false;
            setVerify(Valid);
        }
    }

    /**
     * Method condFive:  The sum of the four digits in the expiration date
     * must be less than the product of the last two digits of the card number
     * @param cardArray
     * @param cardDate 
     */
    private void condFive(int[] cardArray, int[] cardDate) {
        Valid = false;
        for (int i = 0; i < cardDate.length; i++) {
            dateTotal += cardDate[i];
        }
        for (int i = cardArray.length - 1; i >= cardArray.length - 2; i--) {
            lstTwo *= cardArray[i];
        }
        if (lstTwo > dateTotal) {
            Valid = true;
            setVerify(Valid);
            condSix(cardArray);
        } else {
           
            Valid = false;
            setVerify(Valid);
        }
    }

    /**
     * Method condSix: The sum of the first four digits must be one 
     * less than the sum of the last four digits 
     * @param cardArray 
     */
    private void condSix(int[] cardArray) {
        Valid = false;
        for (int i = 0; i < 4; i++) {
            fstFour += cardArray[i];
        }
        for (int i = cardArray.length - 1; i >= cardArray.length - 4; i--) {
            lstFour += cardArray[i];
        }
        if (lstFour - fstFour == 1) {
            Valid = true;
            setVerify(Valid);
            condSeven(cardArray);
        } else {
            Valid = false;
            setVerify(Valid);
        }
    }
    
    /**
     * Method condSeven: If you treat the first two digits as a two-digit 
     * number, and the 15th and 16th digits as a two digit number, their sum 
     * must be 100
     * @param cardArray 
     */
    private void condSeven(int[] cardArray) {
        Valid = false;
        lstTwo = 0;
        fstTwo = Integer.parseInt(Integer.toString(cardArray[0]) 
                + Integer.toString(cardArray[1]));
        lstTwo = Integer.parseInt(Integer.toString(cardArray[cardArray.length - 2]) 
                + Integer.toString(cardArray[cardArray.length - 1]));
        if (fstTwo + lstTwo == 100) {
            Valid = true;
            setVerify(Valid);
        } else {
            Valid = false;
            setVerify(Valid);
        }
    }
} //End Subclass VerifyCard
