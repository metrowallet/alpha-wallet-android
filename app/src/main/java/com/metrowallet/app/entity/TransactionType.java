package com.metrowallet.app.entity;

public enum TransactionType
{
    UNKNOWN,
    LOAD_NEW_TOKENS,
    MAGICLINK_TRANSFER,
    MAGICLINK_PICKUP,
    MAGICLINK_SALE,
    MAGICLINK_PURCHASE,
    PASS_TO,
    PASS_FROM,
    TRANSFER_TO,
    RECEIVE_FROM,
    REDEEM,
    ADMIN_REDEEM,
    CONSTRUCTOR,
    TERMINATE_CONTRACT,
    UNKNOWN_FUNCTION,
    INVALID_OPERATION,
    TRANSFER_FROM,
    ALLOCATE_TO,
    APPROVE,
    RECEIVED,
    SEND,
    SEND_ETH,
    TOKEN_SWAP,
    WITHDRAW,
    DEPOSIT,
    CONTRACT_CALL,
    ILLEGAL_VALUE;
}