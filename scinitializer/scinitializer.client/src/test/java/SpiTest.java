import org.boreas.study.scinitializer.core.service.SearchService;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * Created by boreas320 on 16/6/7.
 */
public class SpiTest {
    @Test
    public void searchSpiTest() throws Exception {
        ServiceLoader<SearchService> searchServices = ServiceLoader.load(SearchService.class);
        searchServices.iterator().forEachRemaining(searchService -> {
            System.out.println(searchService.search("a"));
        });

    }
}
