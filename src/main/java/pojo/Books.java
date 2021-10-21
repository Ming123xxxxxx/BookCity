package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/20 14:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

private int bookID;
private String bookName;
private String author;
private int bookCounts;
private String detail;

}
