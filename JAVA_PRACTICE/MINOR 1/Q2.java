class OverDraftException extends Exception{
    OverDraftException(String message){
        super(message);
    }
}

class BankAccount {
    double balance =235648907;
    
    void deposit(int x){
        
        if(x<0){
            try {
            if(x<0) throw new  OverDraftException("MUFT KA MAAL"); //negative value
            else{
        balance+=x;
    }
        }
        catch(OverDraftException e){
            
            System.out.println("No overdraft "+ e.getMessage());
        }
    }
    }
    
    void withdraw(int w){
        
        try{if (w>balance){throw new  OverDraftException("CHALAK BRO");}
            else {
                balance -=w;
            }
            
        }
        catch( OverDraftException e){
            System.out.println("NO OVERDRAFT !!!" +e.getMessage());
        }
    }
double checkBalance()
{
        return balance;
}
    
}

class Q2{
    public static void main (String []args)
    {BankAccount B = new BankAccount();
    B.deposit(-234);
double bl =    B.checkBalance();
System.out.println("Balance is " +bl);
    
    }
    
}