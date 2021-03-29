import time


def send_correct_text_donos(driver):
    print("start send_correct_text_donos")
    time.sleep(5)
    element = driver.find_element_by_css_selector('.sq0yoh-7')
    element.click()
    time.sleep(10)
    element = driver.find_element_by_css_selector('.sc-2rdf5u-3')
    element.send_keys("Nowy donos testowy")
    time.sleep(10)
    #element = driver.find_element_by_xpath('/html/body/div[3]/div/div[4]/div[1]/div/div[2]/div/div/div/div[3]/form/div[8]/span')
    #element.click()
    print("correct end")

