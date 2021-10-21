package service;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/20 15:18
 */
public interface BookService {

    //增加书
    int addBook(Books books);
    //删除书
    int deleteBookById(int id);
    //更新书
    int updateBook(Books books);
    //按id查询书
    Books queryBookById(int id);
    //查询所有书
    List<Books> queryBookAll();

}
