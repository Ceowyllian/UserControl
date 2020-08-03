import java.sql.SQLException;
import services.UserService;
import entities.User;

public class App 
{
	//Попытка создать и сохранить пользователя
    public static void main ( String[] args ) throws SQLException
    {
    	UserService userService = new UserService();
    	User user = new User("Ivan","Ivanov","asdfg6789","qwerty12345","blank","town");
    	userService.saveUser(user);
    }
}
