import requests

URL = "http://127.0.0.1:5000/users"

def req_test():
    badURL = "http://127.0.0.1:5000/lo"
    r = requests.get(url = badURL)
    status = r.status_code
    url = r.url
    print("###########################################################################################################")
    print("Bad status test")
    assert status == 404
    print(status)
    print("###########################################################################################################")
    print("Bad url test")
    assert url == badURL
    print(url)


def get_user_test():
    r = requests.get(url = URL)
    get_user_result = r.json()
    status = r.status_code
    url = r.url
    print("###########################################################################################################")
    print("Correct status")
    assert status == 200
    print(status)
    print("###########################################################################################################")
    print("Correst url test")
    assert url == URL
    print(url)
    return get_user_result


def post_user_test():
    before = get_user_test()
    DATE = {'userId' : 'c1c', 'name' : 'Filip', 'city' : 'Gdansk'}
    r = requests.post(url = URL, data = DATE)
    after = r.json()
    print("###########################################################################################################")
    print("Correst post test")
    print(before)
    print(after)
    assert before != after

#def put_user_test():
#    DATE = {'userId' : 'c1c', 'locations' : '0007'}
#    r = requests.put(url=URL, date=DATE)


def dell_user_test():
    before = get_user_test()
    DATE = {'userId' : 'c1c'}
    r = requests.delete(url = URL, data = DATE)
    after = get_user_test()
    print("###########################################################################################################")
    print("Correst delete test")
    print(before)
    print(after)
    assert before != after


if __name__ == '__main__':
    post_user_test()
    #put_user_test()
    dell_user_test()
    req_test()