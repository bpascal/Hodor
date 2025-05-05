package com.codido.hodor.api.common.util;

import com.alibaba.dashscope.aigc.generation.Generation;
import com.alibaba.dashscope.aigc.generation.GenerationParam;
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.common.Message;
import com.alibaba.dashscope.common.Role;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>desc: 智能问答工具类 </p>
 * <p>date: 2025/1/15 19:59 </p>
 *
 * @author nuosi fsofs@163.com
 * @version v1.0.0
 * update:[序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class ChatQAUtil {
    private static final String DASHSCOPE_API_KEY = "sk-f9251f4bed25413eb991d7d58a541636";

    /**
     * <p>desc: 描述这个方法功能的注释
     * 请参考文档：https://help.aliyun.com/zh/model-studio/developer-reference/error-code"
     * </p>
     * <p>date: 2025/1/15 20:15 </p>
     *
     * @author nuosi fsofs@163.com
     */
    public static String question(String question, String prompt, String resultFormat) throws NoApiKeyException, InputRequiredException {
        Generation gen = new Generation();
        Message systemMsg = Message.builder()
                .role(Role.SYSTEM.getValue())
                .content("SQL工程师")
                .build();
        Message userMsg = Message.builder()
                .role(Role.USER.getValue())
                .content(question)
                .build();

        GenerationParam.GenerationParamBuilder<?, ?> builder = GenerationParam.builder();
        // 若没有配置环境变量，请用百炼API Key将下行替换为：.apiKey("sk-xxx")
        builder.apiKey(DASHSCOPE_API_KEY)
                // 模型列表：https://help.aliyun.com/zh/model-studio/getting-started/models
                .model("qwen-turbo")
                .prompt(prompt)
                .messages(Arrays.asList(systemMsg, userMsg))
                .resultFormat(GenerationParam.ResultFormat.MESSAGE);
        if (resultFormat != null) {
            builder.resultFormat(resultFormat);
        }

        GenerationParam param = builder.build();
        //System.out.println("提问文本：" + param.toString());

        GenerationResult result = gen.call(param);
        //System.out.println("返回文本：" + result.getOutput());

        if (result.getOutput().getText() != null) {
            return result.getOutput().getText();
        } else {
            if (result.getOutput().getChoices() != null && result.getOutput().getChoices().get(0) != null) {
                return result.getOutput().getChoices().get(0).getMessage().getContent();
            }
        }

        return null;
    }

    public static String question(String question, String prompt) throws NoApiKeyException, InputRequiredException {
        return question(question, prompt, null);
    }


    /**
     * 从Markdown代码片段中提取SQL
     */
    public static String extractSqlFromMarkdown(String markdownText) {
        Pattern pattern = Pattern.compile("```sql\\n([\\s\\S]*?)\\n```");
        Matcher matcher = pattern.matcher(markdownText);

        if (matcher.find()) {
            // 提取SQL语句
            String sqlStatement = matcher.group(1).trim();
            return sqlStatement;
        } else {
            return markdownText;
        }
    }
}
