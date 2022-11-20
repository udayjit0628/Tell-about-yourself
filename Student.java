package Introyourself;

class Student{  //First class
private String name;
private String location;
private String graduation; 
private String postgraduation; 
private int percentage; 
private String workexperience;

    


public Student(){

name = "My self Udayjit Charpe";
location =  "I'm from Amravati";
graduation = "I did my graduation in BCA from HVPM Amravati";
postgraduation = "I did my postgraduation in MCA from Vidyabharati Mahavidyalaya Amravati";
percentage = 87;
workexperience = "I did work in web media company amravati backend daveloper";
}

public String getName(){

    return name;

}

public void setName(String n){

    name = "My self Udayjit Charpe";
}

public String getLocation(){

    return location;
}

public void setLocation(String l){

    name = "I'm from Amravati";
}

public String getGraduation(){

    return graduation;
}

public void setGraduation(String g){

    graduation = "I did my graduation in BCA from HVPM Amravati";

}

public String getPostgraduation(){

    return postgraduation;
}

public void setPostgraduation(String pg){

    postgraduation = "I did my postgraduation in MCA from Vidyabharati Mahavidyalaya Amravati";

}

 public int getPercentage(){

    return percentage;
}

public void setPercentage(int p){

    percentage = 87;

}

 public String getWorkexperience(){

    return workexperience;
}

public void setWorkexperience(String w){

    workexperience = "I did work in web media company amravati backend daveloper";

}

}

