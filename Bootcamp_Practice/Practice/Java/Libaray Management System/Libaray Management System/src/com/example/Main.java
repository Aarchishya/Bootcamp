package com.example;

import com.example.entity.Book;
import com.example.entity.User;
import com.example.service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IBookService bookService = new BookServiceImpl();
        IUserService userService = new UserServiceImpl();
        ILoanRecordService loanRecordService = new LoanRecordServiceImpl();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("3. Library Manager");

            System.out.println("Select role");
            int role = sc.nextInt();

            switch (role) {

                case 1:
                    System.out.println("1. List books");
                    System.out.println("2. Search book");
                    System.out.println("3. Borrow book");
                    System.out.println("4. Return book");
                    System.out.println("5. Raise request for new book");
                    int selOpt = sc.nextInt();
                    switch (selOpt) {
                        case 1:
                            System.out.println(bookService.getAllBooks());
                            break;
                        case 2:
                            System.out.println("Enter author name or title or publisher name");
                            System.out.println(bookService.searchBooks(sc.nextLine()));
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Wrong choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Add Book");
                    System.out.println("2. Delete Book");
                    System.out.println("3. List Books");
                    System.out.println("4. Update Book");
                    System.out.println("5. Add user");
                    System.out.println("6. Delete user");
                    System.out.println("7. List users");
                    System.out.println("8. Update user");
                    System.out.println("9. Assign user as library manager");

                    int ab = sc.nextInt();
                    switch (ab) {
                        case 1:

                            System.out.print("Enter book name: ");
                            sc.nextLine();
                            String title2 = sc.nextLine();

                            System.out.println("Enter author name");
                            String authorName = sc.nextLine();

                            System.out.println("Enter description");
                            String description = sc.nextLine();

                            System.out.println("Enter price");
                            double price = sc.nextDouble();

                            System.out.println("Enter publisher");
                            sc.nextLine();
                            String publisher1 = sc.nextLine();

                            System.out.println("Enter quantity");
                            int quantity = sc.nextInt();

                            Book book = new Book(title2, description, price, authorName, publisher1, quantity);
                            bookService.addBook(book);
                            break;

                            case 2:
                                System.out.println("Enter book id");
                                int id = sc.nextInt();

                                bookService.deleteBook(id);
                                break;

                            case 3:
                                System.out.println(bookService.getAllBooks());
                                break;

                            case 4:
                                System.out.println("Enter bookId which needs to be updated");
                                Book book3 = bookService.search(sc.nextInt());
                                break;

                            case 5:
                                System.out.println("Enter User name");
                                String userName = sc.nextLine();
                                System.out.println("Enter Full name");
                                String fullName = sc.nextLine();
                                System.out.println("Enter contact no");
                                String contactNumber = sc.nextLine();
                                System.out.println("Enter eMail");
                                String eMail = sc.nextLine();
                                System.out.println("Enter password");
                                String password = sc.nextLine();
                                System.out.println("Enter role");
                                String role1 = sc.nextLine();
                                userService.addUser(new User(userName, fullName, contactNumber, eMail, password, role1));
                                break;

                            case 6:
                                System.out.println("Enter User id");
                                int userId = sc.nextInt();

                                userService.deleteUser(userId);
                                break;

                            case 7:
                                System.out.println(userService.getAllUsers());
                                break;

                            case 8:

                                break;

                            case 9:
                                break;

                            default:
                                System.out.println("Wrong Choice");
                                break;

                    }
                    break;
                case 3:
                    System.out.println("1. Add Book");
                    System.out.println("2. Delete Book");
                    System.out.println("3. Update Book");
                    System.out.println("4. Add loan record");
                    System.out.println("5. Delete loan record");
                    System.out.println("6. Update loan record");
                    System.out.println("7. Order new Books");
                    System.out.println("8. Update title of book");
                    System.out.println("9. Update price of book");
                    System.out.println("10. Update quantity of book");
                    System.out.println("11. View Loan Records");


                    int abc = sc.nextInt();
                    switch (abc) {
                        case 1:
                            System.out.println("Enter book name");
                            String title = sc.nextLine();
                            System.out.println("Enter author name");
                            String authorName = sc.nextLine();
                            System.out.println("Enter description");
                            String description = sc.nextLine();
                            System.out.println("Enter price");
                            double price = sc.nextDouble();
                            System.out.println("Enter publisher");
                            String publisher = sc.nextLine();
                            System.out.println("Enter quantity");
                            int quantity = sc.nextInt();

                            Book book = new Book(title, description, price, authorName, publisher, quantity);
                            bookService.addBook(book);
                            break;

                        case 2:
                            System.out.println("Enter book id");
                            int id = sc.nextInt();

                            bookService.deleteBook(id);
                            break;

                        case 3:
                            break;

                        case 4:
                            System.out.println("Enter userId");
                            User user = userService.search(sc.nextInt());
                            System.out.println("Enter bookId");
                            Book book1 = bookService.search(sc.nextInt());
                            loanRecordService.borrowBook(user, book1);
                            break;

                        case 5, 6:
                            System.out.println("Enter userId");
                            User user1 = userService.search(sc.nextInt());
                            System.out.println("Enter bookId");
                            Book book2 = bookService.search(sc.nextInt());
                            loanRecordService.returnBook(user1, book2);
                            break;

                        case 7:
                            break;

                        case 8:
                            System.out.println("Enter bookId whose title is to be changed");
                            Book book3 = bookService.search(sc.nextInt());
                            System.out.println("Enter the new title");
                            book3.setTitle(sc.nextLine());
                            bookService.updateBook(book3);
                            break;

                        case 9:
                            System.out.println("Enter bookId whose price is to be changed");
                            Book book4 = bookService.search(sc.nextInt());
                            System.out.println("Enter the new price");
                            book4.setPrice(sc.nextDouble());
                            bookService.updateBook(book4);
                            break;

                        case 10:
                            System.out.println("Enter bookId whose quantity is to be changed");
                            Book book5 = bookService.search(sc.nextInt());
                            System.out.println("Enter the new quantity");
                            book5.setQuantity(sc.nextInt());
                            bookService.updateBook(book5);
                            break;

                        case 11:
                            System.out.println("Enter the userId for which loanRecords needed to be viewed");
                            User user3 = userService.search(sc.nextInt());
                            System.out.println(loanRecordService.getUserLoanRecords(user3).toString());
                            break;

                        default:
                            System.out.println("Wrong Choice");
                            break;
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }

    }

}
