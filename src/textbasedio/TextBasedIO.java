/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedio;

import java.util.Scanner;
/**
 *
 * @author DSTIGANT
 */
public class TextBasedIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // basic printing
         //helloWorldDemo();
         //helloMyNameIs();
        
        // introduction to variables
         //variablesDemo();
         //helloMyNameIsWithVariableName();
        
        // introduction to arithmetic
         //arithmeticDemo();
         //circleAreaWithVariables();
        
        // introduction to reading input, Scanner class
         //inputDemo();
         //circleAreaWithInput();
         //squarePerimeterWithInput();
         //rectangleAreaWithInput();        
        
        // special characters
         //quotePrinter();
         //poemPrinter();
         //tablePrinter();
        
        // extra practice
         //textagon();
         //squarePerimeterWithInput();
         //rectangleAreaWithInput();
         nameAgeFavoriteColorWithInput();
    }
    
    public static void helloWorldDemo()
    {
        System.out.println( "Hello World" );
    }
    
    public static void helloMyNameIs()
    {
        String myn = "My name is \n";
        System.out.println( myn
                + "\t ...who?   \n"
                + myn
                + "\t ...what?  \n"
                + myn
                + "/\\/\\/\\    \n"
                + "slim shady!");
    }
    
    public static void variablesDemo()
    {
        // String variables represent text
        String hairColor = "brown";
        
        // int variables represent whole numbers (integers)
        int weight = 150;
        
        // double variables represent numbers which are not (necessarily) integers
        double GPA = 3.4;
        
        // a variable DECLARATION has three parts:
        // <type>     <name>    =   <initial value> ;
        // type = what sort of thing is this (String, int, double, Turtle etc)
        // name = what does this variable represent/stand for in your program
        // initial value = the (first) value this variable takes on
        
        // you can have the program print out the value of a variable by "+-ing" it with a literal String
        // in a println statement:
        System.out.println( "My programmer has " + hairColor + " hair and weighs " + weight + " pounds " +
                "and has a " + GPA + " GPA" );
        
        // notice that when we use the variables, we only use the name of the variable
        // we DO NOT USE the type or the initial value
        
        // also notice that anything in quotes stands for actual text rather than a variable
        // so the GPA + " GPA" part at the end of the statement ends up producing the output
        // 3.4 GPA
        // The GPA outside the quotes refers to the variable GPA but the GPA inside the quotes
        // does NOT refer to that variable.
    }
    
    public static void helloMyNameIsWithVariableName()
    {
        String computerName = "Kasra";
        System.out.println("My name is " + computerName);
    }
    
    public static void arithmeticDemo()
    {
        // numeric variables and numbers can be used in arithmetic expressions:
        double numHoursToday = 5.3;
        double numHoursTomorrow = 4.2;
        double speed = 55.0;
        
        double distance = (numHoursToday + numHoursTomorrow) * speed;
        
        System.out.println( "If you travel " + speed + " miles per hour " + 
                "for " + numHoursToday + " hours today " +
                "and " + numHoursTomorrow + " tomorrow, " +
                "you will travel " + distance + " miles" );
        
        // +, -, * and ( ) all work as you would expect... 
        // don't forget that the standard Order of Operations applies!
        double distanceWrong = numHoursToday + numHoursTomorrow * speed;
        System.out.println( "If you travel " + speed + " miles per hour " + 
                "for " + numHoursToday + " hours today " +
                "and " + numHoursTomorrow + " tomorrow, " +
                "you will NOT travel " + distanceWrong + " miles" );
         
        // division (/) works with doubles, but there are some caveats with ints
        double timeLeft = 3.0;
        double distanceLeft = 137.0;
        double requiredSpeed = distanceLeft / timeLeft;
        System.out.println( "We have to travel at " + requiredSpeed + " miles per hour to make it on time" );
        
        int numCookies = 17;
        int numPeople = 5;
        // numCookiesPerPerson could be a non-whole number, so use double instead of int
        double numCookiesPerPerson = numCookies/numPeople;
        System.out.println( "Each person gets " + numCookiesPerPerson + " cookies" );
        // Note the problem in the output for the above line
        
        // There is no simple way to do exponentiation (like your calculator uses ^), 
        // so for now, if you want to square or cube something, use multiplication:
        
        double rCyl = 5.0;
        double hCyl = 7.0;
        double vCyl = 3.14*rCyl*rCyl*hCyl;  // volume is pi * r^2 * h, but use r*r instead of r^2
        System.out.println( "The volume of the cylinder is " + vCyl );
        
        // you can also add Strings together using + to form new String variables:
        String title = "Mr.";
        String firstName = "David";
        String lastName = "Stigant";
        String fullName = firstName + " " + lastName;
        String formalName = title + " " + fullName;
        
        System.out.println( "My formal name is " + formalName );
    }
    
    public static void circleAreaWithVariables()
    {
        double radius = 5;
        System.out.print("The radius is " + radius + "\n");
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.print("The radius is " + area + "\n");
    }
    
    public static void inputDemo()
    {
        // create a scanner from System.in (which represents input from the keyboard)
        Scanner keyboard = new Scanner( System.in );
        
        // prompt the user for their name
        System.out.println( "What is your name?" );
        
        // read the user's name from the keyboard
        // declare a variable in which to store the name
        // this variable should be of type String since a
        // a name consists of textual information
        // set name equal to the next piece of input from the keyboard - keyboard.next()
        String name = keyboard.next();
        
        // print out a message to <name> from the computer
        System.out.println( "Hello " + name + ", my name is Lambda the Ultimate" );
    }
    
    public static void circleAreaWithInput()
    {
        Scanner keyboard = new Scanner( System.in );
        System.out.println( "Radius?" );
        String radiusString = keyboard.next();
        double radius = Double.parseDouble(radiusString);
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println( " \nThe area of a circle with that radius is \n"
                + area + ".");
    }
    
    public static void squarePerimeterWithInput()
    {
       Scanner keyboard = new Scanner( System.in );
       System.out.println( "Side length?" );
       double side = keyboard.nextDouble();
       System.out.println( "The area of a square with that sidelength is" + Math.pow(side,2));
    }
    
    public static void rectangleAreaWithInput()
    {
       Scanner keyboard = new Scanner( System.in );
       System.out.println( "Side lengths of your rectangle? \n"
               + "[number] [number] ENTER" );
       String sideInput = keyboard.nextLine();
       String[] sides = sideInput.split(" ");
       System.out.println( "Side one is " + sides[0] + " and side two is "
               + sides[1] + ".");
       System.out.println( "The area of a rectangle with those sides is " 
               + (Double.parseDouble(sides[0]) * Double.parseDouble(sides[1])) 
               + ".");
    }

    private static void quotePrinter() 
    {
       System.out.println( "\"Ask not what your country can do for you but what you can do for your country\" - John F. Kennedy");
    }

    private static void poemPrinter() 
    {
        System.out.println( "\\Haikus are easy\\\n" +
            "\\But sometimes they don't make sense\\\n" +
            "\\Refrigerator\\");
    }

    private static void tablePrinter() 
    {
        System.out.println( "Item                  	Price\n"
                + "========================\n"
                + "Hamburgers   	$5.00\n"
                + "Fries                  	$1.50\n"
                + "Shakes              	$3.75");
    }

    private static void textagon() 
    {
        System.out.println( "   /----\\\n"
                + "  /      \\\n"
                + " /        \\\n"
                + "/      	\\\n"
                + "|      	|\n"
                + "|      	|\n"
                + "|      	|\n"
                + "|      	|\n"
                + "\\      	/\n"
                + " \\        /\n"
                + "  \\      /\n"
                + "   \\----/");
    }

    private static void nameAgeFavoriteColorWithInput() 
    {
        Scanner keyboard = new Scanner( System.in );
        
        System.out.println( "Enter number of people:");
        int peopleNumber = keyboard.nextInt();
        String[] names = new String[peopleNumber];
        int[] ages = new int[peopleNumber];
        String[] color = new String[peopleNumber];
        String[] order = { "first", "second", "third" };
        int i = 0;
        String t = "\t";
        //TODO: understand enhanced for loops
        
//        for ( String name: names ) {
//            System.out.println( "Enter person #" + (i+1) + "'s name:");
//            names[i++] = keyboard.next();
//        }      
        for (; i <peopleNumber; ++i) {
            System.out.println( "Enter the " + order[i] + " person's name:");
            names[i] = keyboard.next();

            System.out.println( "Enter " + names[i] + "'s age:");
            ages[i] = keyboard.nextInt();

            System.out.println( "Enter " + names[i] + "'s favourite color:");
            color[i] = keyboard.next();
        }
        
        System.out.println( "Name\tAge\tFavorite Color \n"
                + "=====================================================");
        
        for (int j = 0; j<3; ++j) {
            System.out.println( names[j] + t + ages[j] + t + color[j]);
        }
    } 
}
