import json

from pip._vendor.distlib.compat import raw_input


def print_help(driver):
    if driver == "driver":
        print("bad driver")
    else:
        with open(driver) as f:
            data = json.load(f)

        return data


def print_one_command(driver, command):
    if driver == "driver":
        print("bad driver")
    else:
        with open(driver) as f:
            data = json.load(f)
            data = json.dumps(data[command], indent=4)

        return data


def print_parameter(driver, command, par):
    if driver == "driver" or par == "parameter":
        print("bad driver or parameter")
    else:
        with open(driver) as f:
            data = json.load(f)
            data = json.dumps(data[command][par], indent=4)

        return data


def menu(driver):
    print("Choose next step: ")
    print("1. Show help")
    print("2. Show one command")
    print("3. Show parameter")
    choose = raw_input("Type 1, 2 or 3")
    if choose == "1":
        help = print_help(driver)
        print(json.dumps(help, indent=4))
    elif choose == "2":
        command = raw_input("Type command you want see: ")
        command = print_one_command(driver, command)
        print(json.dumps(command, indent=4))
    elif choose == "3":
        command = raw_input("Type command you want see: ")
        par = raw_input("Type parameter you want see: ")
        parameter = print_parameter(driver, command, par)
        print(json.dumps(parameter, indent=4))
    else:
        print("bad input")


def choose_driver():
    driver = "driver"
    choose = raw_input('Type W or L')
    if choose == "W" or choose == "w":
        driver = "windows_cmd.json"
        print("You choose Windows")
        menu(driver)

    elif choose == "L" or choose == "l":
        driver = "linux_cmd.json"
        print("You choose Linux")
        menu(driver)

    else:
        print("Bad value. Try again")
        choose_driver()
