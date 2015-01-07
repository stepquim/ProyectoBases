// Fig. 16.20: ValidateInputEmpleado.java
// Validate user information using regular expressions.

package proyectobases;

public class ValidateInputEmpleado  
{
    // validate ID
   public static boolean validateID (String id)
   {
       return id.matches( "\\d{10}" );
   }
   
   // validate RUC
    public static boolean validateRUC (String id)
   {
       return id.matches( "\\d{13}" );
   }
    
   // validate cedula
   public static boolean validateCedula (String cedula)
   {
       return cedula.matches( "[0-2]\\d{9}" );
   }
  
    public static boolean validateNumFactura (String numfactura)
   {
       return numfactura.matches( "\\d{1,9}" );
       //Aunque creo que este se genera sucesivamente
   }
    
   //validate product name
   public static boolean validateProductName( String productName )
   {
      return productName.matches( "([a-zA-Z]{3,20}|[a-zA-Z]{2,10}\\s[a-zA-Z]{2,10})" );
   } // end method validateFirstName
   
   //validate first name
   public static boolean validateFirstName( String firstName )
   {
      return firstName.matches( "([a-zA-Z]{3,20}|[a-zA-Z]{2,10}\\s[a-zA-Z]{2,10})" );
   } // end method validateFirstName

   // validate last name
   public static boolean validateLastName( String lastName )
   {
      return lastName.matches( "([a-zA-Z]{3,20}|[a-zA-Z]{2,10}\\s[a-zA-Z]{3,10})" );
   } // end method validateLastName

   // validate fecha
   public static boolean validateFecha( String fecha )
   {
    //return ( address.matches( "3(0|1)/([0][1-9]|10|11|12)/\\d{4}" ) || address.matches( "[0-2][0-9]/([0][1-9]|10|11|12)/\\d{4}" ));
   return ( fecha.matches( "2[1-8]/02/\\d{4}" ) || 
   fecha.matches( "([0-1][1-9]|10|20)/02/\\d{4}" ) || 
   fecha.matches( "31/(01|03|05|07|08|10)/\\d{4}" ) || 
   fecha.matches( "([0-2][1-9]|10|20|29|30)/(01|[0][3-9]|10|11|12)/\\d{4}" ));
   } // end method validateFecha

    // validate address
   public static boolean validateAddress( String address )
   {
      return address.matches( 
         "[a-zA-Z.-]{1,10}\\s+[a-zA-Z0-9.-]{1,10}\\s*[a-zA-Z0-9.-]*\\s*[a-zA-Z0-9.-]*" );
   } // end method validateAddress
   // validate City
   
    public static boolean validateCantidad( String cantidad )
   {
      return cantidad.matches( "\\d{1,3}") ;
      
      ///VALIDAR LA CANTIDAD DE ACUERDO A LO DISPONIBLE EN LA BASE DE DATOS
      
   } // end method validateCity
    
     public static boolean validatePrecio( String precio )
   {
      return precio.matches( "\\d{1,4}.\\d{2}") ;
      
      ///VALIDAR LA CANTIDAD DE ACUERDO AL PRECIO EN LA BASE DE DATOS
      
   } // end method validateCity
   
   public static boolean validateCity( String city )
   {
      return (city.matches("([a-zA-Z]{3,10}|[a-zA-Z]{2,3}\\s[a-zA-Z]{2,7})")) ;
   } // end method validateCity

   // validate state
   public static boolean validateState( String state )
   {
      return state.matches( "([a-zA-Z]{3,10}|[a-zA-Z]{2,3}\\s[a-zA-Z]{2,7})" ) ;
   } // end method validateState
   
    // validate tipo
   public static boolean validateTipo( String tipo )
   {
      return tipo.matches( "[a-zA-Z]{3,10}" ) ;
   } // end method validateState

   // validate zip
   public static boolean validateZip( String zip )
   {
      return zip.matches( "\\d{5}" );
   } // end method validateZip

   // validate phone
   public static boolean validatePhone( String phone )
   {
      return (phone.matches( "[+]593\\d{10}") || phone.matches( "\\d{9}")) ;
   } // end method validatePhone
   
   // validate descripcion
   public static boolean validateDescripcion( String descripcion )
   {
      return descripcion.matches( "[^`]{5,30}") ;
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

