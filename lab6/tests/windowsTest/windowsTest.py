import json
import unittest

from controller import print_help, print_one_command, print_parameter


class TestWindows(unittest.TestCase):

    def test_windows_help_is_work(self):
        driver = "../../windows_cmd.json"
        self.assertIsNotNone(json.dumps(print_help(driver), indent=4))

    def test_windows_help_is_return_text(self):
        driver = "../../windows_cmd.json"
        json_string = {
            "cd": {
                "name": "call",
                "description": "change directory",
                "args": {
                    "/d": "Changes the current drive as well as the current directory for a drive.",
                    "/?": "Displays help at the command prompt."

                }
            },

            "chkdsk": {
                "name": "chkdsk",
                "description": "Checks the file system and file system metadata of a volume for logical and physical errors.",
                "args": {
                    "/f": "Fixes errors on the disk. The disk must be locked. If chkdsk cannot lock the drive, a message appears that asks you if you want to check the drive the next time you restart the computer.",
                    "/v": "Displays the name of each file in every directory as the disk is checked."
                }
            },

            "find": {
                "name": "find",
                "description": "fSearches for a string of text in a file or files, and displays lines of text that contain the specified string.",
                "args": {
                    "/v": "Displays all lines that don't contain the specified <string>.",
                    "/n": "Precedes each line with the file's line number."
                }
            },

            "sort": {
                "name": "sort",
                "description": "Reads input, sorts data, and writes the results to the screen, to a file, or to another device.",
                "args": {
                    "/r": "Reverses the sort order (that is, sorts from Z to A and from 9 to 0).",
                    "/t": "Specifies the path of the directory to hold the sort command's working storage if the data does not fit in the main memory. By default, the system temporary directory is used."
                }

            },

            "tree": {
                "name": "tree",
                "description": "Displays the directory structure of a path or of the disk in a drive graphically",
                "args": {
                    "/f": "Displays the names of the files in each directory.",
                    "/a": "Specifies to use text characters instead of graphic characters to show the lines that link subdirectories."
                }

            }

        }

        expected = json.dumps(json_string, indent=4)
        result = json.dumps(print_help(driver), indent=4)
        self.assertEqual(result, expected)

    def test_windows_command_tree_is_not_none(self):
        driver = "../../windows_cmd.json"
        command = "tree"
        result = json.dumps((print_one_command(driver, command)), indent=4)
        self.assertIsNotNone(result)

    def test_linux_command_cp_args(self):
        driver = "../../windows_cmd.json"
        command = "find"
        par = "args"
        result = json.dumps((print_parameter(driver, command, par)), indent=4)
        expected = json.dumps({
                    "/v": "Displays all lines that don't contain the specified <string>.",
                    "/n": "Precedes each line with the file's line number."
                }, indent=4)

        self.assertEqual(result, expected)


if __name__ == '__main__':
    TestWindows.main()
