public class Student {

    String studentName;
    int grade;
    int money;
    Student(String studentName,int money) {
        this.studentName = studentName;
        this.money = money;

    }
    public void takeBus(Bus bus){
            bus.take(1000);
            money-= 1000;
    }
    public void takeSubway(Subway subway){
            subway.take(1200);
            money-=1200;
    }
    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
