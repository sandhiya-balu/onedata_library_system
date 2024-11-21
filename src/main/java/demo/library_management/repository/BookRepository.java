package demo.library_management.repository;

import demo.library_management.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.time.LocalDateTime;;

@Repository
public class BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Book book) {
        String sql = "INSERT INTO books (title, author, isbn, published_date, available_copies) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getIsbn(), LocalDateTime.now(), book.getAvailableCopies());
    }

    public List<Book> findAll() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    public Book findById(int id) {
        String sql = "SELECT * FROM books WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BookRowMapper(), id);
    }

    public void update(int id, Book book) {
        String sql = "UPDATE books SET title = ?, author = ?, isbn = ?, published_date = ?, available_copies = ? WHERE id = ?";
        jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getIsbn(), LocalDateTime.now(), book.getAvailableCopies(), id);
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM books WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    private static class BookRowMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setIsbn(rs.getString("isbn"));
            book.setPublishedDate(rs.getDate("published_date").toLocalDate());
            book.setAvailableCopies(rs.getInt("available_copies"));
            return book;
        }
    }
}
