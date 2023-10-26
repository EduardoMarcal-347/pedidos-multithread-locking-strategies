create table TB_PRODUTO (
    COD_PRODUTO integer auto_increment,
    DES_PRODUTO varchar(255) not null,
    VLR_PRODUTO numeric,
    QTD_ESTOQUE integer,
    COD_VRS integer,
    primary key (COD_PRODUTO)
);