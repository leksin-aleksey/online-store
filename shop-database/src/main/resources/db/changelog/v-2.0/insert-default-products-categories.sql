INSERT INTO `products` (`name`, `company`)
    VALUE   ('pasta plate', 'china'),
        ('steak plate', 'china'),
        ('knife', 'china'),
        ('spoon', 'china'),
        ('fork', 'china'),
        ('amd 10', 'amd'),
        ('amd 20', 'amd'),
        ('intel 13', 'intel'),
        ('ferrari enzo', 'ferrari');
GO

INSERT INTO `categories` (`name`, `description`)
VALUE ('Kitchenware', 'All for kitchen'), ('CPU', 'All for computers'), ('Cars', 'All for cars');
GO

INSERT INTO `products_categories`(`product_id`, `category_id`)
SELECT (SELECT id FROM `products` WHERE `name` = 'pasta plate'), (SELECT id FROM `categories` WHERE `name` = 'Kitchenware')
UNION ALL
SELECT (SELECT id FROM `products` WHERE `name` = 'steak plate'), (SELECT id FROM `categories` WHERE `name` = 'Kitchenware')
UNION ALL
SELECT (SELECT id FROM `products` WHERE `name` = 'knife'), (SELECT id FROM `categories` WHERE `name` = 'Kitchenware')
UNION ALL
SELECT (SELECT id FROM `products` WHERE `name` = 'spoon'), (SELECT id FROM `categories` WHERE `name` = 'Kitchenware')
UNION ALL
SELECT (SELECT id FROM `products` WHERE `name` = 'fork'), (SELECT id FROM `categories` WHERE `name` = 'Kitchenware')
UNION ALL
SELECT (SELECT id FROM `products` WHERE `name` = 'amd 10'), (SELECT id FROM `categories` WHERE `name` = 'CPU')
UNION ALL
SELECT (SELECT id FROM `products` WHERE `name` = 'amd 20'), (SELECT id FROM `categories` WHERE `name` = 'CPU')
UNION ALL
SELECT (SELECT id FROM `products` WHERE `name` = 'intel 13'), (SELECT id FROM `categories` WHERE `name` = 'CPU')
UNION ALL
SELECT (SELECT id FROM `products` WHERE `name` = 'ferrari enzo'), (SELECT id FROM `categories` WHERE `name` = 'Cars');
GO
