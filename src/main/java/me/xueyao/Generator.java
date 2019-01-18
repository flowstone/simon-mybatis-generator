package me.xueyao;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Mybatis Generator 生成器
 * @Author: Simon.Xue
 * @Date: 2019/1/18 13:44
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        //警告信息集合
        List<String> warnings = new ArrayList<String>();
        //读取生成器的配置文件
        InputStream resourceAsStream = Generator.class.getResourceAsStream("/mybatis-generator.xml");
        //创建配置解析器
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        //解析配置文件
        Configuration configuration = configurationParser.parseConfiguration(resourceAsStream);
        resourceAsStream.close();
        //
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(true);
        //创建生成器对象
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, defaultShellCallback, warnings);
        //执行生成代码
        myBatisGenerator.generate(null);
        //输出警告信息
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
