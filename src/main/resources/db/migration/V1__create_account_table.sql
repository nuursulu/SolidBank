CREATE TABLE IF NOT EXISTS  Accounts
(
    id bigint AUTO_INCREMENT,
    accountId NVARCHAR(20),
    accountType NVARCHAR(20)  NOT NULL,
    clientId NVARCHAR(20)  NOT NULL,
    balance DECIMAL NOT NULL,
    withdrawAllowed BOOLEAN NOT NULL,
    CONSTRAINT PK_Account PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS  Transactions(
    idTransaction bigint AUTO_INCREMENT,
    accountId NVARCHAR(20) NOT NULL,
    clientId NVARCHAR(20) NOT NULL,
    amount DECIMAL NOT NULL,
    transactType  NVARCHAR(20) NOT NULL,
    status BOOLEAN NOT NULL,
    transactionDate DATETIME NOT NULL,
    CONSTRAINT PK_Transaction PRIMARY KEY (idTransaction)
);





