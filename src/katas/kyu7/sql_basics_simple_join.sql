SELECT products.id,
       products.name,
       isbn,
       company_id,
       price,
       companies.name company_name
FROM products
  JOIN companies
  ON (company_id = companies.id);