String name="user10";
		int id=10;
		
		//String qry="update user set name='"+name+"' "+"where id="+id;
		
		String qry="update user set name=? where id=?";
	PreparedStatement ps=con.prepareStatement(qry);
	ps.setString(1, name);
	ps.setInt(2, id);
	ps.executeUpdate();
	
	String n="user5";
	String j="test";
	int i=13;
	
	String qry1="insert into user values(?,?,?);";
    PreparedStatement ps1=con.prepareStatement(qry1);
	ps1.setInt(1, i);
	ps1.setString(2, n);
	ps1.setString(3, j);
	//ps1.executeUpdate();
		  
	
	String qry3="create procedure if not exists demo() "
			    +"begin "
			    +"select name from user where id=10; "
	            +"end ;";
	
	    Statement s= con.createStatement();
	    s.executeUpdate(qry3);
	    
//	   CallableStatement cs= con.prepareCall(qry3);
//	    ResultSet rs1=cs.executeQuery("{call demo()}");
//	   
//	while(rs1.next())
//	{
//		System.out.println(rs1.getString(1));
//	}