package com.han.model.po;

public class DepositBin {
    private Integer id;

    private String shortName;

    private String bankName;

    private String cardType;

    private String cardName;

    private Integer cardNumberLength;

    private Integer cardBinLength;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public Integer getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(Integer cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public Integer getCardBinLength() {
        return cardBinLength;
    }

    public void setCardBinLength(Integer cardBinLength) {
        this.cardBinLength = cardBinLength;
    }
}