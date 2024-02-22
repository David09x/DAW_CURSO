<?php

namespace App\Entity;

use ApiPlatform\Metadata\ApiResource;
use App\Repository\BookRepository;
use Doctrine\ORM\Mapping as ORM;
use ApiPlatform\Metadata\Get;
use ApiPlatform\Metadata\Post;
use ApiPlatform\Metadata\Put;
use ApiPlatform\Metadata\GetCollection;
use ApiPlatform\Metadata\Delete;
use Symfony\Component\Serializer\Annotation\Groups;
use ApiPlatform\Metadata\Link;
use Symfony\Component\Validator\Constraints as Assert;

#[ORM\Entity(repositoryClass: BookRepository::class)]
#[ApiResource(
        normalizationContext: ['groups' => ['authors']],
)]
#[ApiResource(

    uriTemplate: '/authors/{id}/book',
operations: [ new GetCollection() ],
    uriVariables: [
        'id' => new link(fromClass: Author::class, toProperty: 'author'),
    ],
    normalizationContext:['groups' => ['authors']]
)]
class Book
{
    #[ORM\Id]
    #[ORM\GeneratedValue]
    #[ORM\Column]
    #[Groups(['authors'])]
    private ?int $id = null;

    #[ORM\Column(length: 100)]
    #[Groups(['authors'])]
    private ?string $title = null;

    #[ORM\Column]
    #[Groups(['authors'])]
    #[Assert\LessThanOrEqual(2024)]
    private ?int $year = null;

    #[ORM\Column(length: 100)]
    #[Groups(['authors'])]
    private ?string $genre = null;

    #[ORM\Column]
    #[Groups(['authors'])]
    private ?int $pages = null;

    #[ORM\ManyToOne(inversedBy: 'books')]
    #[ORM\JoinColumn(nullable: false)]
    #[Groups(['authors'])]
    private ?Author $author = null;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getTitle(): ?string
    {
        return $this->title;
    }

    public function setTitle(string $title): static
    {
        $this->title = $title;

        return $this;
    }

    public function getYear(): ?int
    {
        return $this->year;
    }

    public function setYear(int $year): static
    {
        $this->year = $year;

        return $this;
    }

    public function getGenre(): ?string
    {
        return $this->genre;
    }

    public function setGenre(string $genre): static
    {
        $this->genre = $genre;

        return $this;
    }

    public function getPages(): ?int
    {
        return $this->pages;
    }

    public function setPages(int $pages): static
    {
        $this->pages = $pages;

        return $this;
    }

    public function getAuthor(): ?Author
    {
        return $this->author;
    }

    public function setAuthor(?Author $author): static
    {
        $this->author = $author;

        return $this;
    }
}
