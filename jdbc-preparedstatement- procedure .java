String qry4="create procedure if not exists demo1() "
		    +"begin "
		    +"select name from user where id=10; "
		    +"select name from user where id=12; "
            +"end ;";

    Statement s1= con.createStatement();
    s1.executeUpdate(qry4);
    
   CallableStatement cs1= con.prepareCall("{call demo1()}");
    
   boolean b=cs1.execute();
   System.out.println(b);
   
   while(b)
   {
	  
	  ResultSet r= cs1.getResultSet();
	  while(r.next())
	  {
		 System.out.println(r.getString("name")); 
	  }
	  
	  b=cs1.getMoreResults();
	  
	  
   }