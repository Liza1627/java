class Student{
    int sno;
    String Name;
    void setSno(int sno){
        this.sno=sno;
    }
    int getSno(){
        return this.sno;
    }
    void setSname(String Name){
        this.Name=Name;
    }
    String getName(){
        return this.Name;
    }
    void display(){
        System.out.println(sno+"..."+Name);
    }
}