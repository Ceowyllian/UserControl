package services;

import dao.UserDao;
import entities.User;

// в этом классе (будет) описана логика для вызова обращений к БД
public class UserService {
private UserDao usersDao = new UserDao();

public User findUser (int id) {
	return usersDao.findById(id);
}

public void saveUser(User user) {
    usersDao.save(user);
}

public void deleteUser(User user) {
    usersDao.delete(user);
}

public void updateUser(User user) {
    usersDao.update(user);
}

}
