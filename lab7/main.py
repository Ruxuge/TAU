from unittest import result

from pip._vendor.distlib.compat import raw_input


def start():
    n1 = input("n1: ")
    control_input(n1)


def control_input(x):
        try:
            val = int(x)
            print("Input is an integer number. Number = ", val)
            result = "int_number"
        except ValueError:
            try:
                val = float(x)
                print("Input is a float  number. Number = ", val)
                result = "float_number"
            except ValueError:
                print(x + "is a string")
                result = "string"

        return result


if __name__ == '__main__':
    start()