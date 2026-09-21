public class Member extends Person{
    private String name;
    private String memberId;

    public Member(String name, String memberId){
        super(name, memberId);
    }

    public String getName(){
        return name;
    }

    public String getMemberId(){
        return memberId;
    }

    public String getRole(){
        return "Member";
    }

    @Override
    public String toString(){
        return name + "(ID: " + memberId + ")";
    }
}