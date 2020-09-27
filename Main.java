import com.github.houbb.markdown.toc.core.impl.AtxMarkdownToc;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        if(args == null || args.length == 0)
        {
            System.out.println("请输入markdown文件或markdown目录的路径");
            System.exit(0);
        }
        Path path = Path.of(System.getProperty("user.dir"),args[0]);
        if(path.getFileName().toString().contains("."))
        {
            if(path.getFileName().toString().endsWith(".md"))
            {
                AtxMarkdownToc.newInstance().genTocFile(path.toString());
                System.out.println("md文件转换完成");
            }
            else
            {
                System.out.println("请确保输入的是.md文件");
                System.exit(0);
            }
        }
        else
        {
            if(Files.exists(path))
            {
                AtxMarkdownToc.newInstance().genTocDir(path.toString());
                System.out.println("md目录转换完成");
            }
            else
            {
                System.out.println("文件夹不存在");
                System.exit(0);
            }
        }
    }
}
