SELECT regexp_split_to_table(text, '[aeiou]') AS results
FROM random_string;