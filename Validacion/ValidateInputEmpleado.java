// Fig. 16.20: ValidateInputEmpleado.java
// Validate user information using regular expressions.

public class ValidateInputEmpleado  
{
   // validate cedula
   public static boolean validateFirstName( String firstName )
   {
      return firstName.matches( "[0-2]\\d{9}" );
   } // end method validateFirstName

   // validate nombre
   public static boolean validateLastName( String lastName )
   {
      return lastName.matches( "([a-zA-Z]{3,20}|[a-zA-Z]+\\s[a-zA-Z]{3,20})" );
   } // end method validateLastName

   // validate fecha
   public static boolean validateAddress( String address )
   {
    //return ( address.matches( "3(0|1)/([0][1-9]|10|11|12)/\\d{4}" ) || address.matches( "[0-2][0-9]/([0][1-9]|10|11|12)/\\d{4}" ));
   return ( address.matches( "2[1-8]/02/\\d{4}" ) || 
   address.matches( "([0-1][1-9]|10|20)/02/\\d{4}" ) || 
   address.matches( "31/(01|03|05|07|08|10)/\\d{4}" ) || 
   address.matches( "([0-2][1-9]|10|20|29|30)/(01|[0][3-9]|10|11|12)/\\d{4}" ));
     //address.matches( "[0-2][0-9]/[0][1-9]/\\d{4}" ) ||
   } // end method validateAddress

   // validate telefono
   public static boolean validateCity( String city )
   {
      return (city.matches( "593\\d{10}") ||city.matches( "\\d{9}")) ;
   } // end method validateCity

   // validate state
   public static boolean validateState( String state )
   {
      return state.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
   } // end method validateState

   // validate zip
   public static boolean validateZip( String zip )
   {
      return zip.matches( "\\d{5}" );
   } // end method validateZip

   // validate phone
   public static boolean validatePhone( String phone )
   {
      return phone.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
   } // end method validatePhone
} // end class ValidateInput

/*
 **************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 **************************************************************************
*/

