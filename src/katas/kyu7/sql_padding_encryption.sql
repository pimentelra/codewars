SELECT
  rpad(md5, char_length(sha256) , '1') AS md5,
  lpad(sha1, char_length(sha256) , '0') AS sha1,
  sha256
FROM encryption;