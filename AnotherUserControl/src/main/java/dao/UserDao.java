package dao;

import entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;
import java.util.List;

// Этот класс отвечает только за взаимодействие приложения с БД
public class UserDao {
	
	// найти пользователя по индексу
	public User findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

	// добавить новую запись с информацией про пользователя в таблицу 
    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession(); // новая сессия
        Transaction tx1 = session.beginTransaction(); // новая транзакция
        session.save(user); // сохранить пользователя
        tx1.commit(); // подтвердить
        session.close(); // завершить сессию
    }

    // изменить информацию про уже существующего пользователя
    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    // удалить пользователя
    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }
}
