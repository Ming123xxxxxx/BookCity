package service;

import dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.Books;

import java.util.List;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/20 15:19
 */


public class BookServiceImpl implements BookService{

    //service调用dao层:组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper){
       this.bookMapper=bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryBookAll() {
        return bookMapper.queryBookAll();
    }
}
