INSERT INTO `products` (`name`)
    VALUE   ('pasta plate'),
        ('steak plate'),
        ('knife'),
        ('spoon'),
        ('fork'),
        ('amd 10'),
        ('amd 20'),
        ('intel 13'),
        ('ferrari enzo');
GO

INSERT INTO `categories` (`name`)
VALUE ('Kitchenware'), ('CPU'), ('Cars');
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
