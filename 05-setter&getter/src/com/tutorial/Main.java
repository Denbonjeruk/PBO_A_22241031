package com.tutorial;

 class User {
    private String username;
    private String password;

 
    //membuat konstruktor
    User(String username, String password){
        this.username= username;
        this.password= password;
    }

    //method getter
    public String  getUsername(){
        return this.username;
    }

    public String getPassword(){
        return  this.password;
    }

    public void setPassword(String password){
        this.password= password;
    }



    
    public static void main(String[] args) {
       // instalasi objek
       User person_1 = new User("janova", "12345678");
       
       //panggil method getter
       System.out.println(person_1.getUsername());
        System.out.println(person_1.getUsername());

        person_1.setPassword("den654321");
        System.out.println("new password:" +person_1.getPassword());
        
       
    }
}
