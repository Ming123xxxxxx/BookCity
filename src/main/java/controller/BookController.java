package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Books;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/21 10:59
 */

@Controller
@RequestMapping("/book")
public class BookController {

    //controller 调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //跳转到增加书籍页面
    @RequestMapping("toaddPaper")
    public String toaddPaper(){
        return  "addBook";
    }

    //跳转到修改书籍页面
    @RequestMapping("update")
    public String update(int id,Model model){
        Books books= bookService.queryBookById(id);
//        List<Books> books =new ArrayList<Books>();
//        books.add(book);
        model.addAttribute("books",books);
        return  "updateBook";
    }

    //跳转到按ID查询书籍页面
    @RequestMapping("querybyid")
    public String querybyid(){
        return  "querybyid";
    }

    //查询所有的书籍,并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=bookService.queryBookAll();
        model.addAttribute("list",list);
        return  "allBook";
    }

    //添加书籍
    @RequestMapping("addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return  "redirect:allBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return  "redirect:allBook";
    }

    //删除书籍
    @RequestMapping("deleteBook")
    public String deleteBook(Integer id){
        bookService.deleteBookById(id);
        return  "redirect:allBook";
    }

    //按ID查询
    @RequestMapping("/queryById")
    public String queryById(Integer bookID,Model model){
        Books books= bookService.queryBookById(bookID);
        model.addAttribute("books",books);
        return  "queryBookById";
    }
}
