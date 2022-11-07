import java.util.ArrayList;
import java.util.List;

public class Users {
    String user;
    String timeStamp;
    String status;

    public Users(){
        
    }
    public Users(String user, String timeStamp, String status){
        this.user = user;
        this.timeStamp = timeStamp;
        this.status = status;
    }

    public static void main(String[] args) {
        List<Users> list = new ArrayList<>();
        list.add(new Users("U1", "3:40","loogedIn" ));
        list.add(new Users("U1", "4:40","loogedOut" ));
        list.add(new Users("U2", "5:40","loogedIn" ));
        list.add(new Users("U2", "6:40","loogedOut" ));
        list.add(new Users("U3", "7:40","loogedIn" ));
        list.add(new Users("U3", "8:40","loogedOut" ));

        for(int i=0;i<list.size();i++){
            Users user = list.get(i);
            System.out.println(user.user+" "+user.status+" "+user.timeStamp);
        }
    }
}
