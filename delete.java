try{
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            DB database = mongoClient.getDB( "sofine" );
            System.out.println("Connect to database successfully");
            DBCollection coll;
            coll=database.getCollection("info");

                BasicDBObject Where=new BasicDBObject();

               Where.put("Mob",jTextField2.getText());
                coll.remove(Where);

                JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
                
                System.out.print("remove success");
                        }
                    catch(Exception ex)
                        {
                    JOptionPane.showMessageDialog(null,"Exception occured :"+ex);
        }        // TODO
