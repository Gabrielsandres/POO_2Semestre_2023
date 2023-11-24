package br.ucb.poo;

import br.ucb.poo.dao.UsuarioDAO;
import br.ucb.poo.model.Cachorro;
import br.ucb.poo.model.Gato;
import br.ucb.poo.model.Passaro;
import br.ucb.poo.model.Usuario;
import java.util.Scanner;
import br.ucb.poo.dao.CachorroDAO;
import br.ucb.poo.dao.GatoDAO;
import br.ucb.poo.dao.PassaroDAO;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO(); 
        PassaroDAO dao1 = new PassaroDAO();
        GatoDAO dao2 = new GatoDAO();
        CachorroDAO dao3 = new CachorroDAO();

        Integer opcao = -1;

        System.out.println("\n\nDigite a opção desejada!\n");
        System.out.println("1 - Gerenciar animais da loja");
        System.out.println("2 - Gerenciar cadastro de usuários");
        System.out.print("\nOpção: ");
        opcao = scanner.nextInt();

        if (opcao == 1) {

            System.out.println("Qual animal você deseja alterar?");
            System.out.println("\n\nMenu de opções!\n\nEscolha uma das opções abaixo\n");
            System.out.println("1- Cachorro");
            System.out.println("2- Gato");
            System.out.println("3- Passaro");
            System.out.print("\nOpção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {

                opcao = -1;
                System.out.println("\nAnimal Escolhido: Cachorro\n");

                while (opcao != 5) {
                    System.out.println("\nMenu de opções!\n\nEscolha uma das opções abaixo\n");
                    System.out.println("1- Cadastrar");
                    System.out.println("2- Consultar");
                    System.out.println("3- Atualizar");
                    System.out.println("4- Excluir");
                    System.out.println("5- Sair");
                    System.out.print("\nOpção: ");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:

                            
                              System.out.print("\nDigite o nome do cachorro: ");
                              String nomeCachorro = scanner.next();
                              System.out.print("Digite o raça: ");
                              String raca = scanner.next();
                              System.out.print("Digite a idade: ");
                              Integer idade = scanner.nextInt();
                              System.out.print("Digite a cor: ");
                              String cor = scanner.next();
                              
                              Cachorro novoCachorro = new Cachorro(nomeCachorro, raca, idade, cor);
                              
                              try (CachorroDAO cachorroDAO = new CachorroDAO()) {
                                dao3.salvarCachorro(novoCachorro);
                                System.out.println("Cachorro salvo com sucesso!");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                                                   
                              
                            break;
                        case 2:

                            System.out.print("\nDigite o ID do cachorro: ");
                            Integer idConsulta = scanner.nextInt();
                            Cachorro cachorroConsultado = dao3.getCachorroById(idConsulta);
                            if (cachorroConsultado != null) {
                                System.out.println("\nCachorro encontrado: " + cachorroConsultado + "\n");
                            } else {
                                System.out.println("\nCachorro não encontrado.\n");
                            }
                            break;

                        case 3:
                            System.out.print("Digite o ID do Cachorro a ser atualizado: ");
                            Integer idAtualizacao = scanner.nextInt();
                            Cachorro cachorroAtualizacao = dao3.getCachorroById(idAtualizacao);

                            if (cachorroAtualizacao != null) {
                                System.out.print("Digite o novo nome: ");
                                cachorroAtualizacao.setNome(scanner.next());
                                System.out.print("Digite a nova raça: ");
                                cachorroAtualizacao.setRaca(scanner.next());
                                System.out.print("Digite a nova idade: ");
                                cachorroAtualizacao.setIdade(scanner.nextInt());
                                System.out.print("Digite a nova cor: ");
                                cachorroAtualizacao.setCor(scanner.next());

                                dao3.atualizarCachorro(cachorroAtualizacao);
                                System.out.println("\nCachorro atualizado com sucesso!\n");
                            } else {
                                System.out.println("\nCachorro não encontrado.\n");
                            }
                            break;

                        case 4:
                            System.out.print("\nDigite o ID do Cachorro a ser excluído: ");
                            Integer idExclusao = scanner.nextInt();
                            Cachorro cachorroExclusao = dao3.getCachorroById(idExclusao);

                            if (cachorroExclusao != null) {
                                dao3.deletarCachorro(cachorroExclusao);
                                System.out.println("\nCachorro excluído com sucesso!\n");
                            } else {
                                System

                                        .out.println("\nCachorro não encontrado.");
                            }
                            break;

                        case 5:
                            System.out.println("\nSaindo do programa...");
                            break;

                        default:
                            System.out.println("\nOpção inválida. Tente novamente.");
                            break;
                    }
                }

            } else if (opcao == 2) {

                opcao = -1;
                System.out.println("\nAnimal Escolhido: Gato\n");

                while (opcao != 5) {
                    System.out.println("\nMenu de opções!\n\nEscolha uma das opções abaixo\n");
                    System.out.println("1- Cadastrar");
                    System.out.println("2- Consultar");
                    System.out.println("3- Atualizar");
                    System.out.println("4- Excluir");
                    System.out.println("5- Sair");
                    System.out.print("\nOpção: ");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:

                            System.out.print("\nDigite o nome do gato: ");
                            String nomeGato = scanner.next();
                            System.out.print("Digite a raça: ");
                            String raca = scanner.next();
                            System.out.print("Digite a idade: ");
                            Integer idade = scanner.nextInt();
                            System.out.print("Digite a cor: ");
                            String cor = scanner.next();

                            Gato gato = new Gato(nomeGato, raca, idade, cor);
                            dao2.salvarGato(gato);
                            System.out.println("\nGato cadastrado com sucesso!\n");
                            break;

                        case 2:

                            System.out.print("\nDigite o ID do gato: ");
                            Integer idConsulta = scanner.nextInt();
                            Gato gatoConsultado = dao2.getGatoById(idConsulta);

                            if (gatoConsultado != null) {
                                System.out.println("\nGato encontrado: " + gatoConsultado + "\n");
                            } else {
                                System.out.println("\nGato não encontrado.\n");
                            }
                            break;

                        case 3:
                            System.out.print("\nDigite o ID do Gato a ser atualizado: ");
                            Integer idAtualizacao = scanner.nextInt();
                            Gato gatoAtualizacao = dao2.getGatoById(idAtualizacao);

                            if (gatoAtualizacao != null) {
                                System.out.print("Digite o novo nome: ");
                                gatoAtualizacao.setNome(scanner.next());
                                System.out.print("Digite a nova raça: ");
                                gatoAtualizacao.setRaca(scanner.next());
                                System.out.print("Digite a nova idade: ");
                                gatoAtualizacao.setIdade(scanner.nextInt());
                                System.out.print("Digite a nova cor: ");
                                gatoAtualizacao.setCor(scanner.next());

                                dao2.atualizarGato(gatoAtualizacao);
                                System.out.println("\nGato atualizado com sucesso!\n");
                            } else {
                                System.out.println("\nGato não encontrado.\n");
                            }
                            break;

                        case 4:
                            System.out.print("\nDigite o ID do Gato a ser excluído: ");
                            Integer idExclusao = scanner.nextInt();
                            Gato gatoExclusao = dao2.getGatoById(idExclusao);

                            if (gatoExclusao != null) {
                                dao2.deletarGato(gatoExclusao);
                                System.out.println("\nGato excluído com sucesso!\n");
                            } else {
                                System.out.println("Gato não encontrado.");
                            }
                            break;

                        case 5:
                            System.out.println("\nSaindo do programa...");
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                }

            } else if (opcao == 3) {

                opcao = -1;
                System.out.println("\nAnimal Escolhido: Passaro\n");

                while (opcao != 5) {
                    System.out.println("\nMenu de opções!\n\nEscolha uma das opções abaixo\n");
                    System.out.println("1- Cadastrar");
                    System.out.println("2- Consultar");
                    System.out.println("3- Atualizar");
                    System.out.println("4- Excluir");
                    System.out.println("5- Sair");
                    System.out.print("\nOpção: ");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:

                            System.out.print("\nDigite o nome do passaro: ");
                            String nomePassaro = scanner.next();
                            System.out.print("Digite a raça: ");
                            String raca = scanner.next();
                            System.out.print("Digite a idade: ");
                            Integer idade = scanner.nextInt();
                            System.out.print("Digite a cor: ");
                            String cor = scanner.next();

                            Passaro passaro = new Passaro(nomePassaro, raca, idade, cor);
                            dao1.salvarPassaro(passaro);
                            System.out.println("\nPassaro cadastrado com sucesso!\n");
                            break;

                        case 2:

                            System.out.print("\nDigite o ID do passaro: ");
                            Integer idConsulta = scanner.nextInt();
                            Passaro passaroConsultado = dao1.getPassaroById(idConsulta);

                            if (passaroConsultado != null) {
                                System.out.println("\nPassaro encontrado: " + passaroConsultado + "\n");
                            } else {
                                System.out.println("\nPassaro não encontrado.\n");
                            }
                            break;

                        case 3:
                            System.out.print("\nDigite o ID do Passaro a ser atualizado: ");
                            Integer idAtualizacao = scanner.nextInt();
                            Passaro passaroAtualizacao = dao1.getPassaroById(idAtualizacao);

                            if (passaroAtualizacao != null) {
                                System.out.print("Digite o novo nome: ");
                                passaroAtualizacao.setNome(scanner.next());
                                System.out.print("Digite a nova raça: ");
                                passaroAtualizacao.setRaca(scanner.next());
                                System.out.print("Digite a nova idade: ");
                                passaroAtualizacao.setIdade(scanner.nextInt());
                                System.out.print("Digite a nova cor: ");
                                passaroAtualizacao.setCor(scanner.next());

                                dao1.atualizarPassaro(passaroAtualizacao);
                                System.out.println("\nPassaro atualizado com sucesso!\n");
                            } else {
                                System.out.println("\nPassaro não encontrado.\n");
                            }
                            break;

                        case 4:
                            System.out.print("\nDigite o ID do Passaro a ser excluído: ");
                            Integer idExclusao = scanner.nextInt();
                            Passaro passaroExclusao = dao1.getPassaroById(idExclusao);

                            if (passaroExclusao != null) {
                                dao1.deletarPassaro(passaroExclusao);
                                System.out.println("\nPassaro excluído com sucesso!\n");
                            } else {
                                System.out.println("Passaro não encontrado.");
                            }
                            break;

                        case 5:
                            System.out.println("\nSaindo do programa...");
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                }

            } else {
                System.out.println("\nOpção Inválida!\n");
            }

        }

        if (opcao == 2) {

            while (opcao != 5) {

                System.out.println("\nMenu de opções!\n\nEscolha uma das opções abaixo\n");
                System.out.println("1- Cadastrar");
                System.out.println("2- Consultar");
                System.out.println("3- Atualizar");
                System.out.println("4- Excluir");
                System.out.println("5- Sair");
                System.out.print("\nOpção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("\nDigite o nome: ");
                        String nome = scanner.next();
                        System.out.print("Digite o email: ");
                        String email = scanner.next();
                        System.out.print("Digite a senha: ");
                        String senha = scanner.next();

                        Usuario usuario = new Usuario(nome, email, senha);
                        dao.salvarUsuario(usuario);
                        System.out.println("\nUsuário cadastrado com sucesso!\n");
                        break;

                    case 2:
                        System.out.print("\nDigite o ID do usuário: ");
                        Integer idConsulta = scanner.nextInt();
                        Usuario usuarioConsultado = dao.getUsuarioById(idConsulta);

                        if (usuarioConsultado != null) {
                            System.out.println("\nUsuário encontrado: " + usuarioConsultado + "\n");
                        } else {
                            System.out.println("\nUsuário não encontrado.\n");
                        }
                        break;

                    case 3:
                        System.out.print("\nDigite o ID do usuário a ser atualizado: ");
                        Integer idAtualizacao = scanner.nextInt();
                        Usuario usuarioAtualizacao = dao.getUsuarioById(idAtualizacao);

                        if (usuarioAtualizacao != null) {
                            System.out.print("Digite o novo nome: ");
                            usuarioAtualizacao.setNome(scanner.next());
                            System.out.print("Digite o novo email: ");
                            usuarioAtualizacao.setEmail(scanner.next());
                            System.out.print("Digite a nova senha: ");
                            usuarioAtualizacao.setSenha(scanner.next());

                            dao.atualizarUsuario(usuarioAtualizacao);
                            System.out.println("\nUsuário atualizado com sucesso!\n");
                        } else {
                            System.out.println("\nUsuário não encontrado.\n");
                        }
                        break;

                    case 4:
                        System.out.print("\nDigite o ID do usuário a ser excluído: ");
                        Integer idExclusao = scanner.nextInt();
                        Usuario usuarioExclusao = dao.getUsuarioById(idExclusao);

                        if (usuarioExclusao != null) {
                            dao.deletarUsuario(usuarioExclusao);
                            System.out.println("\nUsuário excluído com sucesso!\n");
                        } else {
                            System.out.println("Usuário não encontrado.");
                        }
                        break;

                    case 5:
                        System.out.println("\nSaindo do programa...");
                        break;

                    default:
                        System.out.println("\nOpção inválida. Tente novamente.");
                        break;
                }
            }
        }

        dao.close();
        dao1.close();
        dao2.close();
        dao3.close(); // Feche a UsuarioDAO no final do programa
        scanner.close();
    }
}
