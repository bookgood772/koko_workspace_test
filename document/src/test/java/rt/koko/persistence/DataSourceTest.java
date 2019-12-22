package rt.koko.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTest {
	   
	   @Setter(onMethod_ = {@Autowired})
	   private DataSource dataSource;

	   @Test
	   public void test() {
	      //db와 연결하려고, 그럴려면 커넥션 풀에서 객체 있어야해. 이걸 연결해
	      
	      try {
	         Connection con = dataSource.getConnection();
	         log.info(con);
	      } catch (Exception e) {
	         fail(e.getMessage());
	      }
	   }

	}
