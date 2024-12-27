package dev.qaplayground.pages;

import com.codeborne.selenide.SelenideElement;
import dev.qaplayground.FakeData;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TagsInputBoxPage {
    // locators
    private static final By tag = By.cssSelector("[class='uit uit-multiply']");

    private static final SelenideElement closeTagBtn = $(tag);
    private static final List<SelenideElement> tagList = $$(tag);

    private static final SelenideElement inputField = $("input[type='text']");


    // methods
    public void removeTag() {
        closeTagBtn.click();
    }

    public int getTagCount() {
        return (int) tagList.stream()
                .filter(SelenideElement::isDisplayed)
                .count();
    }

    public void addTag() {
        inputField.setValue(FakeData.anyBeerName).pressEnter();
    }

}