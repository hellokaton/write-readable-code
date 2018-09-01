package chapter_13;

import java.util.ArrayList;
import java.util.List;

/**
 * 用自然语言描述解决方案
 *
 * @author biezhi
 * @date 2018/9/1
 */
public class Example3 {

    class Movie {
        Integer id;
        String  title;
        String  coverImage;
        String  intro;
    }

    class CurrentIndex {
        int title = 0;
        int cover = 0;
        int intro = 0;
    }

    private List<Movie> findAll(String sql) {
        return new ArrayList<>();
    }

    public void printMoive() {
        List<Movie> titles      = findAll("SELECT id, title FROM movie1 ORDER BY id ASC");
        List<Movie> coverImages = findAll("SELECT id, cover_image FROM movie2 ORDER BY id ASC");
        List<Movie> intros      = findAll("SELECT id, intro FROM movie3 ORDER BY id ASC");

        CurrentIndex currentIndex = new CurrentIndex();

        for (Movie movie : titles) {
            int titleId = titles.get(currentIndex.title).id;
            int coverId = coverImages.get(currentIndex.cover).id;
            int introId = intros.get(currentIndex.intro).id;

            // 如果三行数据的 id 不同，则偏移当前索引
            if (titleId != coverId || titleId != introId) {
                if (titleId <= coverId && titleId <= introId) {
                    currentIndex.title++;
                } else if (coverId <= titleId && coverId <= introId) {
                    currentIndex.cover++;
                } else if (introId <= titleId && introId <= coverId) {
                    currentIndex.intro++;
                } else {
                    // 不会进入这里
                    break;
                }
                continue;
            }

            assert titleId == coverId && titleId == introId;

            System.out.print("id: " + titleId);
            System.out.print(", title: " + titles.get(currentIndex.title).title);
            System.out.print(", cover: " + coverImages.get(currentIndex.cover).coverImage);
            System.out.print(", intro: " + intros.get(currentIndex.intro).intro);
            System.out.print("\n");

            currentIndex.title++;
            currentIndex.cover++;
            currentIndex.intro++;
        }

    }

}
