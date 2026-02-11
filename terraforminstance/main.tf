resource "aws_instance" "web_server" {
  ami           = "ami-0b6c6ebed2801a5cb"  # Ubuntu 20.04 LTS
  instance_type = "t2.micro"

  tags = {
    Name = "indu-web-server"
  }
}