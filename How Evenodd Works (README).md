Evenodd by Amar Chandra uses a complex mechanism to determine if a user-inputted number is even or odd.

This mechanism can be viewed below:

        System.out.print("Enter a number (1 to 1000): ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 1000) {
            if (number == 1 || number == 3 || number == 5 || number == 7 || number == 9 ||
                number == 11 || number == 13 || number == 15 || number == 17 || number == 19 ||
                number == 21 || number == 23 || number == 25 || number == 27 || number == 29 ||
                number == 31 || number == 33 || number == 35 || number == 37 || number == 39 ||
                number == 41 || number == 43 || number == 45 || number == 47 || number == 49 ||
                number == 51 || number == 53 || number == 55 || number == 57 || number == 59 ||
                number == 61 || number == 63 || number == 65 || number == 67 || number == 69 ||
                number == 71 || number == 73 || number == 75 || number == 77 || number == 79 ||
                number == 81 || number == 83 || number == 85 || number == 87 || number == 89 ||
                number == 91 || number == 93 || number == 95 || number == 97 || number == 99 ||
                number == 101 || number == 103 || number == 105 || number == 107 || number == 109 ||
                number == 111 || number == 113 || number == 115 || number == 117 || number == 119 ||
                number == 121 || number == 123 || number == 125 || number == 127 || number == 129 ||
                number == 131 || number == 133 || number == 135 || number == 137 || number == 139 ||
                number == 141 || number == 143 || number == 145 || number == 147 || number == 149 ||
                number == 151 || number == 153 || number == 155 || number == 157 || number == 159 ||
                number == 161 || number == 163 || number == 165 || number == 167 || number == 169 ||
                number == 171 || number == 173 || number == 175 || number == 177 || number == 179 ||
                number == 181 || number == 183 || number == 185 || number == 187 || number == 189 ||
                number == 191 || number == 193 || number == 195 || number == 197 || number == 199 ||
                number == 201 || number == 203 || number == 205 || number == 207 || number == 209 ||
                number == 211 || number == 213 || number == 215 || number == 217 || number == 219 ||
                number == 221 || number == 223 || number == 225 || number == 227 || number == 229 ||
                number == 231 || number == 233 || number == 235 || number == 237 || number == 239 ||
                number == 241 || number == 243 || number == 245 || number == 247 || number == 249 ||
                number == 251 || number == 253 || number == 255 || number == 257 || number == 259 ||
                number == 261 || number == 263 || number == 265 || number == 267 || number == 269 ||
                number == 271 || number == 273 || number == 275 || number == 277 || number == 279 ||
                number == 281 || number == 283 || number == 285 || number == 287 || number == 289 ||
                number == 291 || number == 293 || number == 295 || number == 297 || number == 299 ||
                number == 301 || number == 303 || number == 305 || number == 307 || number == 309 ||
                number == 311 || number == 313 || number == 315 || number == 317 || number == 319 ||
                number == 321 || number == 323 || number == 325 || number == 327 || number == 329 ||
                number == 331 || number == 333 || number == 335 || number == 337 || number == 339 ||
                number == 341 || number == 343 || number == 345 || number == 347 || number == 349 ||
                number == 351 || number == 353 || number == 355 || number == 357 || number == 359 ||
                number == 361 || number == 363 || number == 365 || number == 367 || number == 369 ||
                number == 371 || number == 373 || number == 375 || number == 377 || number == 379 ||
                number == 381 || number == 383 || number == 385 || number == 387 || number == 389 ||
                number == 391 || number == 393 || number == 395 || number == 397 || number == 399 ||
                number == 401 || number == 403 || number == 405 || number == 407 || number == 409 ||
                number == 411 || number == 413 || number == 415 || number == 417 || number == 419 ||
                number == 421 || number == 423 || number == 425 || number == 427 || number == 429 ||
                number == 431 || number == 433 || number == 435 || number == 437 || number == 439 ||
                number == 441 || number == 443 || number == 445 || number == 447 || number == 449 ||
                number == 451 || number == 453 || number == 455 || number == 457 || number == 459 ||
                number == 461 || number == 463 || number == 465 || number == 467 || number == 469 ||
                number == 471 || number == 473 || number == 475 || number == 477 || number == 479 ||
                number == 481 || number == 483 || number == 485 || number == 487 || number == 489 ||
                number == 491 || number == 493 || number == 495 || number == 497 || number == 499 ||
                number == 501 || number == 503 || number == 505 || number == 507 || number == 509 ||
                number == 511 || number == 513 || number == 515 || number == 517 || number == 519 ||
                number == 521 || number == 523 || number == 525 || number == 527 || number == 529 ||
                number == 531 || number == 533 || number == 535 || number == 537 || number == 539 ||
                number == 541 || number == 543 || number == 545 || number == 547 || number == 549 ||
                number == 551 || number == 553 || number == 555 || number == 557 || number == 559 ||
                number == 561 || number == 563 || number == 565 || number == 567 || number == 569 ||
                number == 571 || number == 573 || number == 575 || number == 577 || number == 579 ||
                number == 581 || number == 583 || number == 585 || number == 587 || number == 589 ||
                number == 591 || number == 593 || number == 595 || number == 597 || number == 599 ||
                number == 601 || number == 603 || number == 605 || number == 607 || number == 609 ||
                number == 611 || number == 613 || number == 615 || number == 617 || number == 619 ||
                number == 621 || number == 623 || number == 625 || number == 627 || number == 629 ||
                number == 631 || number == 633 || number == 635 || number == 637 || number == 639 ||
                number == 641 || number == 643 || number == 645 || number == 647 || number == 649 ||
                number == 651 || number == 653 || number == 655 || number == 657 || number == 659 ||
                number == 661 || number == 663 || number == 665 || number == 667 || number == 669 ||
                number == 671 || number == 673 || number == 675 || number == 677 || number == 679 ||
                number == 681 || number == 683 || number == 685 || number == 687 || number == 689 ||
                number == 691 || number == 693 || number == 695 || number == 697 || number == 699 ||
                number == 701 || number == 703 || number == 705 || number == 707 || number == 709 ||
                number == 711 || number == 713 || number == 715 || number == 717 || number == 719 ||
                number == 721 || number == 723 || number == 725 || number == 727 || number == 729 ||
                number == 731 || number == 733 || number == 735 || number == 737 || number == 739 ||
                number == 741 || number == 743 || number == 745 || number == 747 || number == 749 ||
                number == 751 || number == 753 || number == 755 || number == 757 || number == 759 ||
                number == 761 || number == 763 || number == 765 || number == 767 || number == 769 ||
                number == 771 || number == 773 || number == 775 || number == 777 || number == 779 ||
                number == 781 || number == 783 || number == 785 || number == 787 || number == 789 ||
                number == 791 || number == 793 || number == 795 || number == 797 || number == 799 ||
                number == 801 || number == 803 || number == 805 || number == 807 || number == 809 ||
                number == 811 || number == 813 || number == 815 || number == 817 || number == 819 ||
                number == 821 || number == 823 || number == 825 || number == 827 || number == 829 ||
                number == 831 || number == 833 || number == 835 || number == 837 || number == 839 ||
                number == 841 || number == 843 || number == 845 || number == 847 || number == 849 ||
                number == 851 || number == 853 || number == 855 || number == 857 || number == 859 ||
                number == 861 || number == 863 || number == 865 || number == 867 || number == 869 ||
                number == 871 || number == 873 || number == 875 || number == 877 || number == 879 ||
                number == 881 || number == 883 || number == 885 || number == 887 || number == 889 ||
                number == 891 || number == 893 || number == 895 || number == 897 || number == 899 ||
                number == 901 || number == 903 || number == 905 || number == 907 || number == 909 ||
                number == 911 || number == 913 || number == 915 || number == 917 || number == 919 ||
                number == 921 || number == 923 || number == 925 || number == 927 || number == 929 ||
                number == 931 || number == 933 || number == 935 || number == 937 || number == 939 ||
                number == 941 || number == 943 || number == 945 || number == 947 || number == 949 ||
                number == 951 || number == 953 || number == 955 || number == 957 || number == 959 ||
                number == 961 || number == 963 || number == 965 || number == 967 || number == 969 ||
                number == 971 || number == 973 || number == 975 || number == 977 || number == 979 ||
                number == 981 || number == 983 || number == 985 || number == 987 || number == 989 ||
                number == 991 || number == 993 || number == 995 || number == 997 || number == 999) {
                System.out.println("This is an odd number");
            } else {
                System.out.println("This is an even number");
            }
        } else {
            System.out.println("Pick a number between 1 and 1000");
        }
    }

For business inquiries, contact Amar Chandra at amarchandra135@gmail.com
