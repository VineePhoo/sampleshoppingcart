package com.shoppingexpress.online.core;

import com.shoppingexpress.online.util.Utilities;
import cucumber.api.DataTable;
import cucumber.api.Transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomStringTransformer extends Transformer<String> {
    private static final Map<String, String> RANDOM_STRINGS = new HashMap<>();
    public static final RandomStringTransformer INSTANCE = new RandomStringTransformer();

    @Override
    public String transform(String input) {
        return transformString(input);
    }

    public DataTable transform(DataTable dataTable) {
        dataTable.getGherkinRows().forEach(dataTableRow -> dataTableRow.getCells().replaceAll(this::transformString));
        return dataTable;
    }

    private String transformString(String input) {
        final String[] inputCopy = {input};
        Map<String, String> replacements = new HashMap<>();
        Matcher matcher = Pattern.compile("(<random_string_[^>]*>)").matcher(input);
        while (matcher.find()) {
            String group = matcher.group(0);
            replacements.put(group, RANDOM_STRINGS.computeIfAbsent(group, key -> Utilities.getNextUniqueString()));
        }
        replacements.forEach((key, value) -> inputCopy[0] = inputCopy[0].replace(key, value));
        return inputCopy[0];
    }
}
