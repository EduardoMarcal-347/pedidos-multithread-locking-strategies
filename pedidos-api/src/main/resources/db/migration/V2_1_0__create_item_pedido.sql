create table TB_ITEM_PEDIDO (
    COD_ITEM integer auto_increment,
    QTD_ITEM integer,
    COD_PRODUTO integer,
    primary key (COD_ITEM),
    foreign key (COD_PRODUTO) references TB_PRODUTO(COD_PRODUTO)
);