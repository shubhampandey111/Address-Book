/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dell
 */
public class Validations 
{
    private Pattern name;
    private Pattern email;
//    private Pattern password;
    private Pattern phoneno;
    private Pattern address;
    private Pattern city;
    private Pattern zip;
    
    private Matcher matcher;
    private static final String NAME_PATTERN= "^[A-Za-z0-9 ]{3,25}$";
    private static final String EMAIL_PATTERN= "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
//    private static final String PASSWORD_PATTERN= "^[A-Za-z0-9]{5,10}$";  
    private static final String PHONE_PATTERN= "^[0-9]{10}$";;
    private static final String ADDRESS_PATTERN= "^[#.0-9a-zA-Z\\s,-]+$"; 
    private static final String CITY_PATTERN= "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    private static final String ZIP_PATTERN="^[0-9]{6}";
    public Validations()
    {
         name= Pattern.compile(NAME_PATTERN);
         email= Pattern.compile(EMAIL_PATTERN);
//         password= Pattern.compile(PASSWORD_PATTERN);
         phoneno= Pattern.compile(PHONE_PATTERN);
         address=Pattern.compile(ADDRESS_PATTERN);
         city=Pattern.compile(CITY_PATTERN);
         zip=Pattern.compile(ZIP_PATTERN);
    }
      
      public boolean nameValidate(final String name1)
      {
          matcher= name.matcher(name1);
         return matcher.matches();
      }
      
      public boolean emailValidate(final String email1)
      {
           matcher= email.matcher(email1);
            return matcher.matches();
      }
      
//       public boolean passwordValidate(final String pass1)
//      {
//           matcher= password.matcher(pass1);
//            return matcher.matches();
//      }
      
      
       public boolean phonenoValidate(final String phoneno1)
      {
           matcher= phoneno.matcher(phoneno1);
            return matcher.matches();
      }
       public boolean addressValidate(final String address1)
      {
           matcher= address.matcher(address1);
            return matcher.matches();
      }
    public boolean cityValidate(final String city1)
      {
           matcher= city.matcher(city1);
            return matcher.matches();
      }
    public boolean zipValidate(final String zip1)
      {
           matcher= zip.matcher(zip1);
            return matcher.matches();
      }
    
    
}