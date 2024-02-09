package com.christian.springBootTest;

public class Customer
{
   private long customerId;
   private String firstName;
   private String lastName;
   private String email;

   public Customer(final long customerId, final String firstName, final String lastName, final String email)
   {
      this.customerId = customerId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }

   public long getCustomerId()
   {
      return customerId;
   }

   public void setCustomerId(final long customerId)
   {
      this.customerId = customerId;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(final String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(final String lastName)
   {
      this.lastName = lastName;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(final String email)
   {
      this.email = email;
   }
}
